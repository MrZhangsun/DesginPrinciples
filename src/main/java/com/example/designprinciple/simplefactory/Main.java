package com.example.designprinciple.simplefactory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:48
 */
public class Main {
    public static void main(String[] args) {
        Food food = FoodFactory.cookFood(FoodEnums.NOODLE);
        String name = food.getName();
        System.out.println(name);
    }
}
