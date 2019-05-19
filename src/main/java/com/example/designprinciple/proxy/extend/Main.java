package com.example.designprinciple.proxy.extend;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 上午11:00
 */
public class Main {
    public static void main(String[] args) {
        BaseService service = new Service();
        System.out.println(service.doService());

        BaseService proxy = new Proxy();
        System.out.println(proxy.doService());
    }
}
