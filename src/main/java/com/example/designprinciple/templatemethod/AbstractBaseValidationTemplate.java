package com.example.designprinciple.templatemethod;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:21
 */
public abstract class AbstractBaseValidationTemplate {

    protected void validation() {
        commonValidation();
        respectiveValidation();
    }

    private void commonValidation() {
        System.out.println("Common Fields Validation Pass");
    }

    protected abstract void respectiveValidation();
}
