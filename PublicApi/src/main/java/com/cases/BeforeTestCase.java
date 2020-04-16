package com.cases;

import com.config.TestConfig;
import com.model.GetJoke;
import com.model.TableName;
import com.util.ConfigFile;
import com.util.DataBaseUtil;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class BeforeTestCase {
    @BeforeTest
    public void beforeTest() throws IOException {
        TestConfig.getJokeUrl = ConfigFile.getUrl(TableName.getJoke);
        TestConfig.getSingleJokeUrl = ConfigFile.getUrl(TableName.getSingleJoke);
        TestConfig.singlePoetryUrl = ConfigFile.getUrl(TableName.singlePoetry);
        TestConfig.recommendPoetryUrl = ConfigFile.getUrl(TableName.recommendPoetry);
        TestConfig.searchPoetryUrl = ConfigFile.getUrl(TableName.searchPoetry);
        TestConfig.searchAuthorsUrl = ConfigFile.getUrl(TableName.searchAuthors);
        TestConfig.likePoetryUrl = ConfigFile.getUrl(TableName.likePoetry);
        TestConfig.getSongPoetryUrl = ConfigFile.getUrl(TableName.getSongPoetry);
        TestConfig.getTangPoetryUrl = ConfigFile.getUrl(TableName.getTangPoetry);
        TestConfig.musicBroadcastingUrl = ConfigFile.getUrl(TableName.musicBroadcasting);
        TestConfig.musicBroadcastingDetailsUrl = ConfigFile.getUrl(TableName.musicBroadcastingDetailsv);
        TestConfig.musicRankingsUrl = ConfigFile.getUrl(TableName.musicRankings);
        TestConfig.musicRankingsDetailsUrl = ConfigFile.getUrl(TableName.musicRankingsDetails);
        TestConfig.todayVideoUrl = ConfigFile.getUrl(TableName.todayVideo);
        TestConfig.videoHomeTabUrl = ConfigFile.getUrl(TableName.videoHomeTab);
        TestConfig.videoCategoryUrl = ConfigFile.getUrl(TableName.videoCategory);
        TestConfig.videoCategoryDetailsUrl = ConfigFile.getUrl(TableName.videoCategoryDetails);
        TestConfig.videoRecommendUrl = ConfigFile.getUrl(TableName.videoRecommend);
        TestConfig.defaultHttpClient = new DefaultHttpClient();
        TestConfig.sqlSession = DataBaseUtil.getSqlSession();
        TestConfig.get=new HttpGet();
    }
}
