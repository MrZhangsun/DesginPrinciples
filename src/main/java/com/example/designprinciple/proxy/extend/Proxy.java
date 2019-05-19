package com.example.designprinciple.proxy.extend;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 上午10:58
 */
public class Proxy extends BaseService {

    private BaseService service = new Service();

    @Override
    protected String doService() {
        System.out.println("增强之前");
        String originService = service.doService();
        System.out.println("增强之后。。");
        return originService + "Enhanced Service By Proxy";
    }
}
