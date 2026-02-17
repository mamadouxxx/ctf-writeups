/*
 * libfrmg - JNI Wrapper
 *
 * Java Native Interface wrapper for Android integration.
 * Provides Java bindings to the native library.
 */

#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <android/log.h>
#include "../include/libfrmg.h"

#define LOG_TAG "libfrmg-jni"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

/*
 * Class:     com_example_libfrmg_ImageParser
 * Method:    nativeLoadImage
 * Signature: ([B)Lcom/example/libfrmg/ImageInfo;
 */
JNIEXPORT jobject JNICALL
Java_com_example_libfrmg_ImageParser_nativeLoadImage(JNIEnv *env, jclass clazz,
                                                       jbyteArray imageData) {
    if (!imageData) {
        LOGE("Image data is null");
        return NULL;
    }

    /* Get byte array */
    jsize data_len = (*env)->GetArrayLength(env, imageData);
    jbyte *data_bytes = (*env)->GetByteArrayElements(env, imageData, NULL);

    if (!data_bytes) {
        LOGE("Failed to get byte array");
        return NULL;
    }

    /* Parse image */
    frmg_image_t image;
    frmg_error_t error = frmg_load_image((const uint8_t*)data_bytes, data_len, &image);

    (*env)->ReleaseByteArrayElements(env, imageData, data_bytes, JNI_ABORT);

    if (error != FRMG_OK) {
        LOGE("Failed to parse image: %s", frmg_error_string(error));
        return NULL;
    }

    /* Create ImageInfo Java object */
    jclass imageInfoClass = (*env)->FindClass(env, "com/example/libfrmg/ImageInfo");
    if (!imageInfoClass) {
        LOGE("Failed to find ImageInfo class");
        frmg_free_image(&image);
        return NULL;
    }

    jmethodID constructor = (*env)->GetMethodID(env, imageInfoClass, "<init>",
                                                "(IIIII)V");
    if (!constructor) {
        LOGE("Failed to find ImageInfo constructor");
        frmg_free_image(&image);
        return NULL;
    }

    jobject imageInfo = (*env)->NewObject(env, imageInfoClass, constructor,
                                          (jint)image.width,
                                          (jint)image.height,
                                          (jint)image.channels,
                                          (jint)image.bit_depth,
                                          (jint)image.format);

    frmg_free_image(&image);

    LOGI("Successfully parsed image: %dx%d, %d channels, format %d",
         image.width, image.height, image.channels, image.format);

    return imageInfo;
}

/*
 * Class:     com_example_libfrmg_ImageParser
 * Method:    nativeDetectFormat
 * Signature: ([B)I
 */
JNIEXPORT jint JNICALL
Java_com_example_libfrmg_ImageParser_nativeDetectFormat(JNIEnv *env, jclass clazz,
                                                          jbyteArray imageData) {
    if (!imageData) {
        return FRMG_FORMAT_UNKNOWN;
    }

    jsize data_len = (*env)->GetArrayLength(env, imageData);
    jbyte *data_bytes = (*env)->GetByteArrayElements(env, imageData, NULL);

    if (!data_bytes) {
        return FRMG_FORMAT_UNKNOWN;
    }

    frmg_format_t format = frmg_detect_format((const uint8_t*)data_bytes, data_len);

    (*env)->ReleaseByteArrayElements(env, imageData, data_bytes, JNI_ABORT);

    return (jint)format;
}

/*
 * Class:     com_example_libfrmg_ImageParser
 * Method:    nativeGetVersion
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL
Java_com_example_libfrmg_ImageParser_nativeGetVersion(JNIEnv *env, jclass clazz) {
    return (*env)->NewStringUTF(env, "libfrmg v1.0.0");
}
