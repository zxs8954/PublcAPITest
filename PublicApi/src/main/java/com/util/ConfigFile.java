package com.util;


import com.model.TableName;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigFile {
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    public static String getUrl(TableName name) {
        String url = bundle.getString("url");
        String uri = "";
        if (name == TableName.getJoke) {
            uri = bundle.getString("getJokeUri");
        }
        if (name == TableName.getSingleJoke) {
            uri = bundle.getString("getSingleJokeUri");
        }
        if (name == TableName.singlePoetry) {
            uri = bundle.getString("singlePoetryUri");
        }
        if (name == TableName.recommendPoetry) {
            uri = bundle.getString("recommendPoetryUri");
        }
        if (name == TableName.searchPoetry) {
            uri = bundle.getString("searchPoetryUri");
        }
        if (name == TableName.searchAuthors) {
            uri = bundle.getString("searchAuthorsUri");
        }
        if (name == TableName.likePoetry) {
            uri = bundle.getString("likePoetryUri");
        }
        if (name == TableName.getSongPoetry) {
            uri = bundle.getString("getSongPoetryUri");
        }
        if (name == TableName.getTangPoetry) {
            uri = bundle.getString("getTangPoetryUri");
        }
        if (name == TableName.musicBroadcasting) {
            uri = bundle.getString("musicBroadcastingUri");
        }
        if (name == TableName.musicBroadcastingDetailsv) {
            uri = bundle.getString("musicBroadcastingDetailsUri");
        }
        if (name == TableName.musicRankings) {
            uri = bundle.getString("musicRankingsUri");
        }

        if (name == TableName.musicRankingsDetails) {
            uri = bundle.getString("musicRankingsDetailsUri");
        }
        if (name == TableName.todayVideo) {
            uri = bundle.getString("todayVideoUri");
        }
        if (name == TableName.videoHomeTab) {
            uri = bundle.getString("videoHomeTabUri");
        }
        if (name == TableName.videoCategory) {
            uri = bundle.getString("videoCategoryUri");
        }
        if (name == TableName.videoCategoryDetails) {
            uri = bundle.getString("videoCategoryWithIdUri");
        }
        if (name == TableName.videoRecommend) {
            uri = bundle.getString("videoRecommendUri");
        }
        return url + uri;
    }
}
