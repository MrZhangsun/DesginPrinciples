package com.example.designprinciple.responsibilitychain;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:11
 */
public class SecondStepHandler extends ResponsibilityHandler {

    @Override
    protected void handle() {
        System.out.println("Second step validation pass");
        if (this.getNextHandler() != null) {
            this.getNextHandler().handle();
        }
    }
}
