package com.config;

import lombok.Data;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;

@Data
public class TestConfig {
    //新实时段子
    public static String getJokeUrl;
    //通过ID查询段子
    public static String getSingleJokeUrl;
    //随机单句诗词推荐
    public static String singlePoetryUrl;
    //随机一首古诗推荐
    public static String recommendPoetryUrl;
    //搜索古诗词
    public static String searchPoetryUrl;
    //搜索古诗词作者
    public static String searchAuthorsUrl;
    //模糊搜索古诗词（可搜索诗词名、诗词内容、诗词作者）
    public static String likePoetryUrl;
    //获取宋朝古诗词
    public static String getSongPoetryUrl;
    //获取唐朝古诗词
    public static String getTangPoetryUrl;
    //音乐电台接口
    public static String musicBroadcastingUrl;
    //音乐电台详情接口
    public static String musicBroadcastingDetailsUrl;
    //音乐排行榜接口
    public static String musicRankingsUrl;
    //音乐排行榜详情接口
    public static String musicRankingsDetailsUrl;
    //每日视频推荐接口
    public static String todayVideoUrl;
    //视频大纲获取接口
    public static String videoHomeTabUrl;
    //视频分类推荐接口
    public static String videoCategoryUrl;
    //视频分类推荐接口ID
    public static String videoCategoryDetailsUrl;
    //根据ID推荐接口
    public static String videoRecommendUrl;
    //获取客户端
    public static DefaultHttpClient defaultHttpClient;
    public static SqlSession sqlSession;
    public static HttpGet get;
}
