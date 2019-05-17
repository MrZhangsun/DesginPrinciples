package com.example.designprinciple.simplefactory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:43
 */
public class Rice implements Food {
    private final String name = "Rice";

    @Override
    public String getName() {
        return name;
    }
}
