package com.example.designprinciple.templatemethod;

/**
 * Function: 模版方法的使用场景：
 * 继承关系，存在公共代码，存在自定义代码
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:29
 */
public class Main {
    public static void main(String[] args) {
        AbstractBaseValidationTemplate validation = new UserProfileValidation();
        validation.validation();
    }
}
