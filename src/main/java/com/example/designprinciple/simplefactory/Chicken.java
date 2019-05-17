package com.example.designprinciple.simplefactory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:44
 */
public class Chicken implements Food {

    private final String name = "Chicken";

    @Override
    public String getName() {
        return name;
    }
}
