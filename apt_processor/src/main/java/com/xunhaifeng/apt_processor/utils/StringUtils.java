package com.xunhaifeng.apt_processor.utils;

/**
 * @version v0.0.1
 * @name xunhf
 * @time 15:19
 * @change 2019-01-30
 * @describe 描述该类
 */
public class StringUtils {
    //将首字母转为小写
    public static String toLowerCaseFirstChar(String text) {
        if (text == null || text.length() == 0) {
            return "";
        }
        if (Character.isLowerCase(text.charAt(0))) {
            return text;
        }
        return String.valueOf(Character.toLowerCase(text.charAt(0))) + text.substring(1);
    }

    //将首字母转为大写
    public static String toUpperCaseFirstChar(String text) {
        if (Character.isUpperCase(text.charAt(0))) {
            return text;
        } else {
            return String.valueOf(Character.toUpperCase(text.charAt(0))) + text.substring(1);
        }
    }
}
