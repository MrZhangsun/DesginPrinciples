package com.example.designprinciple.singleton;

/**
 * Function: 饿汉式的问题是这个对象用不用都会在类加载的时候创建
 *
 * @author zhangsunjiankun - 2019/5/18 下午12:09
 */
public class HungrySingleton {

    private HungrySingleton() {}

    private static HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
