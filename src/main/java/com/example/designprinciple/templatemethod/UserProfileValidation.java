package com.example.designprinciple.templatemethod;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:27
 */
public class UserProfileValidation extends AbstractBaseValidationTemplate {

    @Override
    protected void respectiveValidation() {
        System.out.println("Respective Fields Validation Pass");
    }
}
