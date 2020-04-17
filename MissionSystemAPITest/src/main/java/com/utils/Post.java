package com.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;


import java.io.IOException;

import java.util.Map;

public class Post {
    public static String doPostAndGetJSONResult(String url, Map<String, Object> map) throws IOException {
        HttpPost post=new HttpPost(url);
        JSONObject param=new JSONObject();
        param.putAll(map);
        StringEntity entity=new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        String result=GetResult.getResult(GetHttpClient.client.execute(post));
        String json=JSONFormatUtil.jsonFormat(result);
        return json;
    }
}
