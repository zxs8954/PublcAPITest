package com.utils;


import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;

import java.io.IOException;

public class Get {
    public static HttpResponse response;
    public static String doGetAndGetJSONResult(String url) throws IOException {
        //传入url
        HttpGet get=new HttpGet(url);
        HttpResponse response=GetHttpClient.client.execute(get);
        //执行get请求
        String result=GetResult.getResult(response);
        Get.response=response;
        //格式化返回字符串，并且以
        String json=JSONFormatUtil.jsonFormat(result);
        //字符串转json
        return json;
    }
}
