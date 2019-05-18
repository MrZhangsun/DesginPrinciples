package com.example.designprinciple.simplefactory;

/**
 * Function: 简单工厂模式解决了代码冗余的问题。如果不使用简单工厂模式去创建对象。那么在实际开发过程中，如果一个对象需要在多个地方使用
 * 那么我们可能就得在多处new出来。那么new这句代码就会存在多处冗余。如果采用简单工厂模式的，只需要在工厂中写一次。
 * 缺点是不易维护，新增实例对象需要修改工厂类
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
