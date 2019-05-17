package com.example.designprinciple.dependencereverse;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2018/12/26 下午8:41
 */
public class PythonCourseImpl implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Study Python Course ...");
    }
}
