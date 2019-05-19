package com.example.designprinciple.responsibilitychain;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:09
 */
public class FirstStepHandler extends ResponsibilityHandler {

    @Override
    protected void handle() {
        System.out.println("First step validation pass");
        if (this.getNextHandler() != null) {
            this.getNextHandler().handle();
        }
    }
}
