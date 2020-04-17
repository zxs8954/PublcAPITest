package com.config;

import lombok.Data;

@Data
public class TestConfig {
    //获取customID
    public static String getCustomIDUrl;
    //7.2积分系统从boss获取用户code
    public static String getCustomCodeUrl;
    //7.3获取用户账户余额
    public static String getBalanceUrl;
    //7.4获取用户等级
    public static String getUserLevelUrl;
    //签到
    public static String signInUrl;
    //补签
    public static String reSignInUrl;
    //访问我的栏目首页首页（GET）
    public static String visitHomePageUrl;
    //访问我的任务展示可领可赚
    public static String visitTaskUrl;
    //访问我的任务展示惊喜任务明细
    public static String visitMyTaskUrl;
    //获取机顶盒播控任务
    public static String getPlayPluginTaskUrl;
    //发送消息到消息通道
    public static String sendInfoUrl;
    //从消息通道获取消息
    public static String getInfoFromUrl;
    //增加积分
    public static String addIntegralUrl;
}
