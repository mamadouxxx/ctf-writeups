package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface PublishingOrBuilder extends MessageOrBuilder {
    String getApiShortName();

    ByteString getApiShortNameBytes();

    String getCodeownerGithubTeams(int i);

    ByteString getCodeownerGithubTeamsBytes(int i);

    int getCodeownerGithubTeamsCount();

    List<String> getCodeownerGithubTeamsList();

    String getDocTagPrefix();

    ByteString getDocTagPrefixBytes();

    String getDocumentationUri();

    ByteString getDocumentationUriBytes();

    String getGithubLabel();

    ByteString getGithubLabelBytes();

    ClientLibrarySettings getLibrarySettings(int i);

    int getLibrarySettingsCount();

    List<ClientLibrarySettings> getLibrarySettingsList();

    ClientLibrarySettingsOrBuilder getLibrarySettingsOrBuilder(int i);

    List<? extends ClientLibrarySettingsOrBuilder> getLibrarySettingsOrBuilderList();

    MethodSettings getMethodSettings(int i);

    int getMethodSettingsCount();

    List<MethodSettings> getMethodSettingsList();

    MethodSettingsOrBuilder getMethodSettingsOrBuilder(int i);

    List<? extends MethodSettingsOrBuilder> getMethodSettingsOrBuilderList();

    String getNewIssueUri();

    ByteString getNewIssueUriBytes();

    ClientLibraryOrganization getOrganization();

    int getOrganizationValue();

    String getProtoReferenceDocumentationUri();

    ByteString getProtoReferenceDocumentationUriBytes();

    String getRestReferenceDocumentationUri();

    ByteString getRestReferenceDocumentationUriBytes();
}
