package com.example.designprinciple.responsibilitychain;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:17
 */
public class ThirdStepHandler extends ResponsibilityHandler {

    @Override
    protected void handle() {
        System.out.println("Third step validation pass");
        if (this.getNextHandler() != null) {
            this.getNextHandler().handle();
        }
    }
}
