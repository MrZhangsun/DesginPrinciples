package com.example.designprinciple.responsibilitychain;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:10
 */
public class Main {

    public static void main(String[] args) {
        ResponsibilityHandler firstStepHandler = new FirstStepHandler();
        ResponsibilityHandler secondStepHandler = new SecondStepHandler();
        ResponsibilityHandler thirdStepHandler = new ThirdStepHandler();

        firstStepHandler.setNextHandler(secondStepHandler);
        secondStepHandler.setNextHandler(thirdStepHandler);

        firstStepHandler.handle();
    }
}
