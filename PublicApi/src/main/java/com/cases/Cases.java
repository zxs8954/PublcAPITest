package com.cases;

import com.alibaba.fastjson.JSONObject;
import com.config.TestConfig;
import com.model.*;
import com.util.JSONFormatUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.security.util.ArrayUtil;

import java.io.IOException;
import java.util.Arrays;


public class Cases {
    Logger log = Logger.getLogger(Cases.class);

    @Test()
    public void getJokeCase() throws IOException {
        GetJoke getJoke = TestConfig.sqlSession.selectOne("getJoke");
        HttpGet get = new HttpGet(TestConfig.getJokeUrl);
        JSONObject param = new JSONObject();
        param.put("page", getJoke.getPage());
        param.put("count", getJoke.getCount());
        param.put("type", getJoke.getType());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        String str = "[" + result + "]";
        JSONArray jsonArray = new JSONArray(str);
        String r1 = (String) jsonArray.getJSONObject(0).get("message");
        String r2 = "成功!";
        Assert.assertEquals(r1, r2);
    }
    @Test
    public void getSingleJoke() throws IOException {
        GetSingleJoke getSingleJoke = TestConfig.sqlSession.selectOne("getSingleJoke");
        HttpGet get = new HttpGet(TestConfig.getSingleJokeUrl);
        JSONObject param = new JSONObject();
        param.put("sid", getSingleJoke.getSid());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        String str = "[" + result + "]";
        JSONArray jsonArray = new JSONArray(str);
        int i1 = jsonArray.getJSONObject(0).getInt("code");
        Assert.assertEquals(i1, 200);
    }

    @Test
    public void getSinglePoetry() throws IOException {
        HttpGet get = new HttpGet(TestConfig.singlePoetryUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void getRecommendPoetry() throws IOException {
        HttpGet get = new HttpGet(TestConfig.recommendPoetryUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void getSearchPoetry() throws IOException {
        SearchPoetry searchPoetry = TestConfig.sqlSession.selectOne("searchPoetry");
        HttpGet get = new HttpGet(TestConfig.searchPoetryUrl);
        JSONObject param = new JSONObject();
        param.put("name", searchPoetry.getName());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void getSearchAuthors() throws IOException {
        SearchAuthors searchAuthors = TestConfig.sqlSession.selectOne("searchAuthors");
        HttpGet get = new HttpGet(TestConfig.searchAuthorsUrl);
        JSONObject param = new JSONObject();
        param.put("name", searchAuthors.getName());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void getLikePoetry() throws IOException {
        LikePoetry likePoetry = TestConfig.sqlSession.selectOne("likePoetry");
        HttpGet get = new HttpGet(TestConfig.likePoetryUrl);
        JSONObject param = new JSONObject();
        param.put("name", likePoetry.getName());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void getSongPoetry() throws IOException {
        GetSongPoetry getSongPoetry = TestConfig.sqlSession.selectOne("getSongPoetry");
        HttpGet get = new HttpGet(TestConfig.getSongPoetryUrl);
        JSONObject param = new JSONObject();
        param.put("page", getSongPoetry.getPage());
        param.put("count", getSongPoetry.getCount());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void getTangPoetry() throws IOException {
        GetTangPoetry getTangPoetry = TestConfig.sqlSession.selectOne("getTangPoetry");
        HttpGet get = new HttpGet(TestConfig.getTangPoetryUrl);
        JSONObject param = new JSONObject();
        param.put("page", getTangPoetry.getPage());
        param.put("count", getTangPoetry.getCount());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void musicBroadcasting() throws IOException {
        HttpGet get = new HttpGet(TestConfig.musicBroadcastingUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void musicBroadcastingDetailsv() throws IOException {
        MusicBroadcastingDetailsv getDetails = TestConfig.sqlSession.selectOne("getDetails");
        HttpGet get = new HttpGet(TestConfig.musicBroadcastingDetailsUrl);
        JSONObject param = new JSONObject();
        param.put("channelname", getDetails.getChannelname());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void musicRankings() throws IOException {
        HttpGet get = new HttpGet(TestConfig.musicRankingsUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void musicRankingsDetails() throws IOException {
        MusicRankingsDetails musicRankingsDetails = TestConfig.sqlSession.selectOne("musicRankingsDetails");
        HttpGet get = new HttpGet(TestConfig.musicBroadcastingDetailsUrl);
        JSONObject param = new JSONObject();
        param.put("type", musicRankingsDetails.getType());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void todayVideo() throws IOException {
        HttpGet get = new HttpGet(TestConfig.todayVideoUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void videoHomeTab() throws IOException {
        HttpGet get = new HttpGet(TestConfig.videoHomeTabUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        String s="["+result+"]";
        JSONArray array=new JSONArray(s);
        int i1=array.getJSONObject(0).getJSONArray("result").getJSONObject(2).getInt("id");
        Assert.assertEquals(i1,-3);
    }

    @Test
    public void videoCategory() throws IOException {
        HttpGet get = new HttpGet(TestConfig.videoCategoryUrl);
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void videoCategoryDetails() throws IOException {
        VideoCategoryDetails videoCategoryDetails = TestConfig.sqlSession.selectOne("videoCategoryDetails");
        HttpGet get = new HttpGet(TestConfig.videoCategoryDetailsUrl);
        JSONObject param = new JSONObject();
        param.put("id", videoCategoryDetails.getId());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }

    @Test
    public void videoRecommend() throws IOException {
        VideoRecommend videoRecommend = TestConfig.sqlSession.selectOne("videoRecommend");
        HttpGet get = new HttpGet(TestConfig.videoRecommendUrl);
        JSONObject param = new JSONObject();
        param.put("id", videoRecommend.getId());
        HttpResponse response = TestConfig.defaultHttpClient.execute(get);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println(JSONFormatUtil.jsonFormat(result));
        log.info(result);
    }
}
