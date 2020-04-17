package com.utils;

import org.apache.http.impl.client.DefaultHttpClient;

public class GetHttpClient {
    public static DefaultHttpClient client = GetHttpClient.getClient();
    public static DefaultHttpClient getClient() {
        return new DefaultHttpClient();

    }
}
