package com.example.designprinciple.simplefactory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:44
 */
public class Noodle implements Food {
    private final String name = "Noodle";

    @Override
    public String getName() {
        return name;
    }
}
