package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface ClientLibrarySettingsOrBuilder extends MessageOrBuilder {
    CppSettings getCppSettings();

    CppSettingsOrBuilder getCppSettingsOrBuilder();

    DotnetSettings getDotnetSettings();

    DotnetSettingsOrBuilder getDotnetSettingsOrBuilder();

    GoSettings getGoSettings();

    GoSettingsOrBuilder getGoSettingsOrBuilder();

    JavaSettings getJavaSettings();

    JavaSettingsOrBuilder getJavaSettingsOrBuilder();

    LaunchStage getLaunchStage();

    int getLaunchStageValue();

    NodeSettings getNodeSettings();

    NodeSettingsOrBuilder getNodeSettingsOrBuilder();

    PhpSettings getPhpSettings();

    PhpSettingsOrBuilder getPhpSettingsOrBuilder();

    PythonSettings getPythonSettings();

    PythonSettingsOrBuilder getPythonSettingsOrBuilder();

    boolean getRestNumericEnums();

    RubySettings getRubySettings();

    RubySettingsOrBuilder getRubySettingsOrBuilder();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasCppSettings();

    boolean hasDotnetSettings();

    boolean hasGoSettings();

    boolean hasJavaSettings();

    boolean hasNodeSettings();

    boolean hasPhpSettings();

    boolean hasPythonSettings();

    boolean hasRubySettings();
}
