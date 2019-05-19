package com.example.designprinciple.observe;

import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:48
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject("Origin");
        Observer a = new AObserver(subject);
        Observer b = new BObserver(subject);
        Observer c = new CObserver(subject);

        subject.setResource("New Resource");
    }
}
