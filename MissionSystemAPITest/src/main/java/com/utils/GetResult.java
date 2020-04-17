package com.utils;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
/**
 * @author zxs
 * @param response 响应结果
 * */
public class GetResult {
    public static String getResult(HttpResponse response) {
        String result = null;
        try {
             result = EntityUtils.toString(response.getEntity(), "ut8");
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            return result;
        }
    }
}
