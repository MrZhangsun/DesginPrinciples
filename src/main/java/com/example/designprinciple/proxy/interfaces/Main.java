package com.example.designprinciple.proxy.interfaces;

import com.example.designprinciple.proxy.interfaces.CommonInterface;
import com.example.designprinciple.proxy.interfaces.Proxy;
import com.example.designprinciple.proxy.interfaces.Service;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 上午10:53
 */
public class Main {
    public static void main(String[] args) {

        // 增强之前
        CommonInterface service = new Service();
        System.out.println(service.service());

        // 代理增强之后
        CommonInterface proxy = new Proxy();
        System.out.println(proxy.service());
    }
}
