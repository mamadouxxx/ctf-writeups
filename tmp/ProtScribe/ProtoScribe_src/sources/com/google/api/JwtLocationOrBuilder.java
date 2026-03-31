package com.google.api;

import com.google.api.JwtLocation;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes.dex */
public interface JwtLocationOrBuilder extends MessageOrBuilder {
    String getCookie();

    ByteString getCookieBytes();

    String getHeader();

    ByteString getHeaderBytes();

    JwtLocation.InCase getInCase();

    String getQuery();

    ByteString getQueryBytes();

    String getValuePrefix();

    ByteString getValuePrefixBytes();

    boolean hasCookie();

    boolean hasHeader();

    boolean hasQuery();
}
