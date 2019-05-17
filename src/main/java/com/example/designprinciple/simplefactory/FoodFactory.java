package com.example.designprinciple.simplefactory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:39
 */
public class FoodFactory {

    private FoodFactory() {}

    public static Food cookFood(FoodEnums food) {
        switch (food) {
            case RICE:
                return new Rice();
            case NOODLE:
                return new Noodle();
            case CHICKEN:
                return new Chicken();
            default:
                throw new UnsupportedOperationException("Unsupported food");
        }
    }
}
