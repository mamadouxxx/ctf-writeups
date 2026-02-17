# libfrmg - Image Parsing Library for Vulnerability Research
# CMake Build Configuration
#
# QUICK START:
#
# Host Build (macOS/Linux):
#   cmake -B build/host -DENABLE_ASAN=ON -DCMAKE_BUILD_TYPE=Debug
#   cmake --build build/host
#
# Android Build:
#   export ANDROID_NDK=/path/to/ndk
#   cmake -B build/android/arm64-v8a \
#     -DCMAKE_TOOLCHAIN_FILE=$ANDROID_NDK/build/cmake/android.toolchain.cmake \
#     -DANDROID_ABI=arm64-v8a \
#     -DANDROID_PLATFORM=android-24 \
#     -DENABLE_ASAN=ON
#   cmake --build build/android/arm64-v8a
#
# libFuzzer Build (requires Homebrew LLVM on macOS):
#   export LLVM_DIR=/opt/homebrew/opt/llvm
#   cmake -B build/libfuzzer \
#     -DCMAKE_C_COMPILER=$LLVM_DIR/bin/clang \
#     -DCMAKE_CXX_COMPILER=$LLVM_DIR/bin/clang++ \
#     -DUSE_LIBFUZZER=ON -DENABLE_ASAN=ON
#   cmake --build build/libfuzzer
#
# Options:
#   -DENABLE_ASAN=ON/OFF        - Enable AddressSanitizer (default: OFF)
#   -DENABLE_UBSAN=ON/OFF       - Enable UndefinedBehaviorSanitizer (default: OFF)
#   -DUSE_LIBFUZZER=ON/OFF      - Build with libFuzzer support (default: OFF)
#   -DBUILD_FUZZER=ON/OFF       - Build fuzzing harness (default: ON for host)
#   -DCMAKE_BUILD_TYPE=Debug/Release - Build type (default: Debug)
#
# Android ABIs:
#   arm64-v8a      - 64-bit ARM (most common)
#   armeabi-v7a    - 32-bit ARM
#   x86_64         - 64-bit x86 (emulator)
#   x86            - 32-bit x86 (emulator)

cmake_minimum_required(VERSION 3.18.1)

project(libfrmg C CXX)

set(CMAKE_C_STANDARD 11)
set(CMAKE_CXX_STANDARD 11)

# Determine if building for Android
if(ANDROID)
    message(STATUS "Building for Android")
    message(STATUS "  ABI: ${ANDROID_ABI}")
    message(STATUS "  Platform: ${ANDROID_PLATFORM}")
    message(STATUS "  NDK: ${ANDROID_NDK}")
else()
    message(STATUS "Building for host platform")
endif()

# Compiler flags
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -Wall -Wextra")
set(CMAKE_C_FLAGS_DEBUG "${CMAKE_C_FLAGS_DEBUG} -g -O0")
set(CMAKE_C_FLAGS_RELEASE "${CMAKE_C_FLAGS_RELEASE} -O2")

# AddressSanitizer build option
option(ENABLE_ASAN "Enable AddressSanitizer" OFF)
if(ENABLE_ASAN)
    set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -fsanitize=address -fno-omit-frame-pointer")
    set(CMAKE_EXE_LINKER_FLAGS "${CMAKE_EXE_LINKER_FLAGS} -fsanitize=address")
endif()

# UndefinedBehaviorSanitizer build option
option(ENABLE_UBSAN "Enable UndefinedBehaviorSanitizer" OFF)
if(ENABLE_UBSAN)
    set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -fsanitize=undefined -fno-omit-frame-pointer")
    set(CMAKE_EXE_LINKER_FLAGS "${CMAKE_EXE_LINKER_FLAGS} -fsanitize=undefined")
endif()

# Coverage for fuzzing
option(ENABLE_COVERAGE "Enable coverage instrumentation" OFF)
if(ENABLE_COVERAGE)
    set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -fprofile-instr-generate -fcoverage-mapping")
    set(CMAKE_EXE_LINKER_FLAGS "${CMAKE_EXE_LINKER_FLAGS} -fprofile-instr-generate")
endif()

# libFuzzer support option (must be before library definitions)
option(USE_LIBFUZZER "Use libFuzzer" OFF)

# If using libFuzzer, add fuzzer flags globally
if(USE_LIBFUZZER)
    add_compile_options(-fsanitize=fuzzer-no-link)
    message(STATUS "libFuzzer instrumentation enabled")
endif()

# Library source files
set(LIBFRMG_SOURCES
    src/utils.c
    src/bmp_parser.c
    src/png_parser.c
    src/jpeg_parser.c
    src/gif_parser.c
    src/tiff_parser.c
    src/exif_parser.c
    src/image_transform.c
    src/image_effects.c
    src/image_loader.c
)

# Build shared library
add_library(frmg SHARED ${LIBFRMG_SOURCES})

target_include_directories(frmg PUBLIC
    ${CMAKE_CURRENT_SOURCE_DIR}/include
)

# Link with zlib for PNG decompression
if(ANDROID)
    target_link_libraries(frmg z log)
else()
    # On macOS, try to find zlib
    find_package(ZLIB)
    if(ZLIB_FOUND)
        target_link_libraries(frmg ZLIB::ZLIB)
    else()
        # Fallback to system zlib
        target_link_libraries(frmg z)
    endif()
endif()

# Build static library for fuzzing
add_library(frmg_static STATIC ${LIBFRMG_SOURCES})

target_include_directories(frmg_static PUBLIC
    ${CMAKE_CURRENT_SOURCE_DIR}/include
)

# For static library, disable Android logging (since liblog can't be statically linked)
if(ANDROID)
    target_compile_definitions(frmg_static PRIVATE NO_ANDROID_LOG)
endif()

if(ANDROID)
    # Only link z statically, not log (log is only available as shared library)
    target_link_libraries(frmg_static z)
else()
    # On macOS, try to find zlib
    if(ZLIB_FOUND)
        target_link_libraries(frmg_static ZLIB::ZLIB)
    else()
        # Fallback to system zlib
        target_link_libraries(frmg_static z)
    endif()
endif()

# Fuzzing harness
option(BUILD_FUZZER "Build fuzzing harness" ON)
if(BUILD_FUZZER)
    # Only build fuzzer for non-libFuzzer Android builds or any host build
    if(NOT (ANDROID AND USE_LIBFUZZER))
        add_executable(frmg_fuzzer
            fuzzing/fuzzing_harness.c
        )

        # Link with static library by default (will be overridden for Android PIE build)
        if(NOT ANDROID)
            target_link_libraries(frmg_fuzzer frmg_static)
        endif()

        # Configure for libFuzzer or standalone
        if(USE_LIBFUZZER)
            # libFuzzer provides its own main() and requires special flags
            target_compile_definitions(frmg_fuzzer PRIVATE LIBFUZZER)

            # Link with libFuzzer runtime (which is C++)
            target_link_options(frmg_fuzzer PRIVATE -fsanitize=fuzzer -stdlib=libc++)

            # Use C++ linker since libFuzzer runtime is C++
            set_target_properties(frmg_fuzzer PROPERTIES LINKER_LANGUAGE CXX)

            # On macOS with Homebrew LLVM, add rpath for libc++
            if(APPLE)
                if(EXISTS "/opt/homebrew/opt/llvm/lib/c++")
                    target_link_options(frmg_fuzzer PRIVATE -L/opt/homebrew/opt/llvm/lib/c++ -Wl,-rpath,/opt/homebrew/opt/llvm/lib/c++)
                elseif(EXISTS "/usr/local/opt/llvm/lib/c++")
                    target_link_options(frmg_fuzzer PRIVATE -L/usr/local/opt/llvm/lib/c++ -Wl,-rpath,/usr/local/opt/llvm/lib/c++)
                endif()
            endif()

            message(STATUS "Building fuzzer with libFuzzer support")
        else()
            # Standalone mode (file-based fuzzing)
            if(ANDROID)
                message(STATUS "Building Android fuzzer for standalone mode")

                # Build frmg_fuzzer as a PIE executable
                # This links dynamically with libfrmg.so

                # Compile with section separation for better alignment
                target_compile_options(frmg_fuzzer PRIVATE
                    -ffunction-sections
                    -fdata-sections
                )

                # Build as PIE (Position Independent Executable) with dynamic linking
                target_link_options(frmg_fuzzer PRIVATE
                    -pie
                    -Wl,--gc-sections
                )

                # Change from static to shared library linkage
                target_link_libraries(frmg_fuzzer frmg)

                message(STATUS "  Building frmg_fuzzer as PIE executable (dynamically linked with libfrmg.so)")
            else()
                message(STATUS "Building fuzzer in standalone mode")
            endif()
        endif()
    endif()
endif()

# JNI wrapper for Android
if(ANDROID)
    add_library(frmg_jni SHARED
        jni/frmg_jni.c
    )

    target_link_libraries(frmg_jni frmg)
endif()

# Installation
install(TARGETS frmg
    LIBRARY DESTINATION lib
    ARCHIVE DESTINATION lib
)

install(FILES include/libfrmg.h
    DESTINATION include
)
