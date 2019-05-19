package com.example.designprinciple.proxy.interfaces;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 上午10:47
 */
public class Proxy implements CommonInterface {
    CommonInterface service = new Service();
    @Override
    public String service() {
        System.out.println("增强之前。。");
        String originService = this.service.service();
        System.out.println("增强之后。。");

        return originService + " Enhanced by proxy";
    }
}
