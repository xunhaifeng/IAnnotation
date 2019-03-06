package com.xunhaifeng.annotationdemo;

import android.app.Activity;

import java.lang.reflect.Method;

/**
 * @version v0.0.1
 * @name xunhf
 * @time 10:01
 * @change 2019-02-27
 * @describe 描述该类
 */
public class ButterKnife {
    public static void bind(Activity activity) {
        Class clazz = activity.getClass();
        try {
            Class bindViewClass = Class.forName(clazz.getName() + "ViewBinding");
            Method method = bindViewClass.getMethod("bind", activity.getClass());
            method.invoke(bindViewClass.newInstance(), activity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
