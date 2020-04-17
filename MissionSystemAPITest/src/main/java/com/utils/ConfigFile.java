package com.utils;

import com.model.TableName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author zxs
 */
public class ConfigFile {
    //读取url
    private static ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.CHINA);

    //根据枚举类传来的类名，返回url
    public static String getUrl(TableName name) {
        String url = null;
        if (name == TableName.CUSTOMID) {
            url = bundle.getString("getCustomID");
        }
        if (name == TableName.CUSTOMCODE) {
            url = bundle.getString("getCustomCode");
        }
        if (name == TableName.GETBALANCE) {
            url = bundle.getString("getBalance");
        }
        if (name == TableName.GETUSERLEVEL) {
            url = bundle.getString("getUserLevel");
        }
        if (name == TableName.SIGNIN) {
            url = bundle.getString("signIn");
        }
        if (name == TableName.RESIGNIN) {
            url = bundle.getString("reSignIn");
        }
        if (name == TableName.visitHomePage) {
            url = bundle.getString("visitHomePage");
        }
        if (name == TableName.visitTask) {
            url = bundle.getString("visitTask");
        }
        if(name==TableName.visitMyTask){
            url=bundle.getString("visitMyTask");
        }
        if(name==TableName.getPlayPluginTask){
            url=bundle.getString("getPlayPluginTask");
        }
        if(name==TableName.sendInfo){
            url=bundle.getString("sendInfo");
        }
        if(name==TableName.getInfoFrom){
            url=bundle.getString("getInfoFrom");
        }
        if(name==TableName.addIntegral){
            url=bundle.getString("addIntegral");
        }
        return url;

    }
}
