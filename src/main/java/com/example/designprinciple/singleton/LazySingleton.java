package com.example.designprinciple.singleton;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午11:46
 */
public class LazySingleton {

    /**
     * 此处创建对象存在三个步骤：
     * 1、分配堆内存；
     * 2、初始化对象；
     * 3、将对象内存地址指向对象引用
     * 添加volatile禁止编译器指令重排序
     */
    private static volatile LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton newInstance() {
        /*
         * 当对象创建完成之后不必每次都走同步代码块，提高了程序的性能
         */
        if (instance == null) {
            /*
             * 此处创建对象存在三个步骤：
             * 1、分配堆内存；
             * 2、初始化对象；
             * 3、将对象内存地址指向对象引用
             * 而且此处存在指令重排序。
             *
             * 加锁的作用：
             * 第一个线程进来之后，在没有指令冲排序的情况下，执行到1、2步骤的时候，instance仍旧是null，此时其他线程仍旧可以进入
             * 第一层判断。如果多个线程进入到了第一层判断,加锁的目的是为了同步执行代码块。
              */
            synchronized (LazySingleton.class) {
                /*
                 * 如果此处不判读，进入第一层判断的多个线程就会创建多个实例
                 */
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
