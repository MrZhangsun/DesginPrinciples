package com.example.designprinciple.singleton;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 下午12:13
 */
public enum EnumSingleton {
    /**
     * Singleton
     */
    instance;

    public EnumSingleton getInstance() {
        return instance;
    }
}
