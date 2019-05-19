package com.example.designprinciple.observe;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:36
 */
public class AObserver extends Observer {

    private Subject subject;

    public AObserver(Subject subject) {
        this.subject = subject;
        subject.getObservers().add(this);
    }

    @Override
    protected void update() {
        System.out.println("A Observer has received the update:" + subject.getResource());
    }

}
