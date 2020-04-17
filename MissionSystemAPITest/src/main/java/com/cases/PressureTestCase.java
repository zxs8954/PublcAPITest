package com.cases;

import com.config.TestConfig;
import com.model.TableName;
import com.utils.ConfigFile;
import com.utils.Get;
import com.utils.Post;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PressureTestCase {
    public static Logger log=Logger.getLogger(PressureTestCase.class);
    @BeforeTest
    public void beforeTest(){
        TestConfig.visitHomePageUrl= ConfigFile.getUrl(TableName.visitHomePage);
        TestConfig.visitTaskUrl=ConfigFile.getUrl(TableName.visitTask);
        TestConfig.visitMyTaskUrl=ConfigFile.getUrl(TableName.visitMyTask);
        TestConfig.getPlayPluginTaskUrl=ConfigFile.getUrl(TableName.getPlayPluginTask);
        TestConfig.sendInfoUrl=ConfigFile.getUrl(TableName.sendInfo);
        TestConfig.getInfoFromUrl=ConfigFile.getUrl(TableName.getInfoFrom);
        TestConfig.addIntegralUrl=ConfigFile.getUrl(TableName.addIntegral);
    }
    @Test
    public void visitHomePage() throws IOException {
        String result=Get.doGetAndGetJSONResult(TestConfig.visitHomePageUrl);
        JSONArray array=new JSONArray(result);
        log.info(result);
        String code=array.getJSONObject(0).getJSONObject("head").getString("statusCode");
        Assert.assertEquals(code,"200");
    }
    @Test
    public void visitTask() throws IOException {
        String result=Get.doGetAndGetJSONResult(TestConfig.visitTaskUrl);
        JSONArray array=new JSONArray(result);
        log.info(result);
    }
    @Test
    public void visitMyTask() throws IOException {
        String result=Get.doGetAndGetJSONResult(TestConfig.visitMyTaskUrl);
        JSONArray array=new JSONArray(result);
        log.info(result);
    }
    @Test
    public void getPlayPluginTask() throws IOException {
        String result=Get.doGetAndGetJSONResult(TestConfig.getPlayPluginTaskUrl);
        JSONArray array=new JSONArray(result);
        String stbID=array.getJSONObject(0).getString("stbId");
        log.info("stID是:"+stbID);
        Assert.assertEquals(stbID,"11040210112052544C31CF2B");
    }
    @Test
    public void sendInfo() throws IOException {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("积分兑换","积分兑换");
        map.put("content","积分商城兑换上新了");
        map.put("level",3);
        map.put("bizType",4);
        map.put("subType",10);
        map.put("stbIds","11040210112052544C31CF2B");
        map.put("validTime","1607390793000");
        String result= Post.doPostAndGetJSONResult(TestConfig.sendInfoUrl,map);
        JSONArray array=new JSONArray(result);
        log.info(result);
        Assert.assertEquals(1,2);
    }
    @Test
    public void getInfoFrom() throws IOException {
        String result=Get.doGetAndGetJSONResult(TestConfig.getInfoFromUrl);
        JSONArray array=new JSONArray(result);
        log.info(Get.response.getStatusLine().getStatusCode());
        Assert.assertEquals(Get.response.getStatusLine().getStatusCode(),200);

    }
    @Test
    public void addIntegra() throws IOException {
        String result=Get.doGetAndGetJSONResult(TestConfig.addIntegralUrl);
        JSONArray array=new JSONArray(result);
        String act=array.getJSONObject(0).getJSONObject("head").getString("statusCode");
        log.info(act);
        Assert.assertEquals(act,"200");
    }
}
