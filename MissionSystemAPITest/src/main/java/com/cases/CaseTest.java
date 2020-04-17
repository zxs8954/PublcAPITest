package com.cases;

import com.config.TestConfig;
import com.model.TableName;
import com.utils.*;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;

public class CaseTest {
    public static Logger log = Logger.getLogger(CaseTest.class);

    @BeforeTest
    public void beforeTest() {
        TestConfig.getCustomIDUrl = ConfigFile.getUrl(TableName.CUSTOMID);
        TestConfig.getCustomCodeUrl = ConfigFile.getUrl(TableName.CUSTOMCODE);
        TestConfig.getBalanceUrl = ConfigFile.getUrl(TableName.GETBALANCE);
        TestConfig.getUserLevelUrl = ConfigFile.getUrl(TableName.GETUSERLEVEL);
        TestConfig.signInUrl = ConfigFile.getUrl(TableName.SIGNIN);
        TestConfig.reSignInUrl = ConfigFile.getUrl(TableName.RESIGNIN);
    }

    @Test
    public void getCustomID() throws IOException {
        String json = Get.doGetAndGetJSONResult(TestConfig.getCustomIDUrl);
        JSONArray array = new JSONArray(json);
        int actual = array.getJSONObject(0).getJSONObject("value").getInt("customerId");
        int expect = 102740233;
        log.info("\r" + "customerId是:" + actual);
        log.info(json);
        Assert.assertEquals(actual, expect);
    }

    @Test
    public void getBalance() throws IOException {
        String json = Get.doGetAndGetJSONResult(TestConfig.getBalanceUrl);
        JSONArray array = new JSONArray(json);
        BigDecimal act = array.getJSONObject(0).getJSONObject("value").getBigDecimal("mobile");
        log.info(act);
        Assert.assertEquals(act, "13958135765");
    }

    @Test
    public void getCustomCode() throws IOException {
        String json = Get.doGetAndGetJSONResult(TestConfig.getCustomCodeUrl);
        JSONArray array = new JSONArray(json);
        String act = array.getJSONObject(0).getJSONObject("data").getString("customerId");
        log.info("customerId是:" + act);
        BigDecimal exp=new BigDecimal("102740233");
        Assert.assertEquals(act, exp);
    }

    @Test
    public void getUserLevel() throws IOException {
        String json = Get.doGetAndGetJSONResult(TestConfig.getUserLevelUrl);
        JSONArray array = new JSONArray(json);
        String act = array.getJSONObject(0).getString("retInfo");
        log.info(act);
        Assert.assertEquals(act, "查询成功");
    }

    @Test(enabled = false)
    public void signIn() throws IOException {
        String json = Get.doGetAndGetJSONResult(TestConfig.signInUrl);
        JSONArray array = new JSONArray(json);
        String act = array.getJSONObject(0).getJSONObject("head").getString("statusCode");
        log.info(act);
        Assert.assertEquals(act, "200");
    }

    @Test(enabled = false)
    public void reSignIn() throws IOException {
        String json = Get.doGetAndGetJSONResult(TestConfig.reSignInUrl);
        JSONArray array = new JSONArray(json);
        //int actual=array.getJSONObject()
        log.info(json);

    }
}
