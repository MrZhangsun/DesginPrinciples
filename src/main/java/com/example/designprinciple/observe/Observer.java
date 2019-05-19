package com.example.designprinciple.observe;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:34
 */
public abstract class Observer {

    protected Subject subject;

    protected abstract void update();
}
