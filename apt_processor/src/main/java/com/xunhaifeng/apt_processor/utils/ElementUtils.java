package com.xunhaifeng.apt_processor.utils;

import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;

/**
 * @version v0.0.1
 * @name xunhf
 * @time 15:19
 * @change 2019-01-30
 * @describe 描述该类
 */
public class ElementUtils {

    //获取包名
    public static String getPackageName(Elements elementUtils, TypeElement typeElement) {
        return elementUtils.getPackageOf(typeElement).getQualifiedName().toString();
    }

    //获取顶层类类名
    public static String getEnclosingClassName(TypeElement typeElement) {
        return typeElement.getSimpleName().toString();
    }

    //获取静态内部类类名
    public static String getStaticClassName(TypeElement typeElement) {
        return getEnclosingClassName(typeElement) + "Holder";
    }

}