package com.example.designprinciple.observe;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/19 下午12:36
 */
public class CObserver extends Observer {

    private Subject subject;

    public CObserver(Subject subject) {
        this.subject = subject;
        subject.getObservers().add(this);
    }

    @Override
    protected void update() {
        System.out.println("C Observer has received the update:" + subject.getResource());
    }
}
