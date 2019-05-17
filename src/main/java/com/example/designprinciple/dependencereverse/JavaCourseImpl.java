package com.example.designprinciple.dependencereverse;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/26 下午8:41
 */
public class JavaCourseImpl implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Study Java Course ...");
    }
}
