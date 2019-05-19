package com.example.designprinciple.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:34
 */
public class Subject {

    private String resource;

    private List<Observer> observers = new ArrayList<>();

    public Subject(String resource) {
        this.resource = resource;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
