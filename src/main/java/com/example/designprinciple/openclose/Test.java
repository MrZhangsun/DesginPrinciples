package com.example.designprinciple.openclose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

    public static void main(String[] args) {
        // origin requirement
        ICourse iCourse = new JavaCourse(100, "Java Design Principle", 348d);
        log.info("Course ID: {}, Course Name: {}, Course Price: {}", iCourse.getId(), iCourse.getName(), iCourse.getPrice());

        // new requirement: Java Course Discount 80%
        ICourse discountJavaCourse = new DiscountJavaCourse(100, "Java Design Principle", 348d, 0.8d);
        DiscountJavaCourse javaCourse = (DiscountJavaCourse) discountJavaCourse;
        log.info("Course ID: {}, Course Name: {}, Origin Course Price: {}, Discount Price: {}", javaCourse.getId(), javaCourse.getName(), javaCourse.getOriginPrice(), javaCourse.getDiscountPrice());

    }
}
