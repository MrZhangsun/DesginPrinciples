package com.example.designprinciple.responsibilitychain;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:07
 */
public abstract class ResponsibilityHandler {

    private ResponsibilityHandler nextHandler;

    protected abstract void handle();

    public ResponsibilityHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(ResponsibilityHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
