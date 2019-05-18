package com.example.designprinciple.abstractfactory;

import com.example.designprinciple.abstractfactory.cpu.CPU;
import com.example.designprinciple.abstractfactory.mainboard.MainBoard;

/**
 * Function: 抽象工厂适用于生产统一产品族的问题。例如。你要组装一个电脑，那就需要购买CPU、主板、硬盘等。但是不同厂家生产的CPU、主板、硬盘
 * 之间存在兼容性问题。所以最好的做法是购买同一厂家生产的所有零部件。也就是CPU、主板、硬盘等应该属于同一个产品族。因此，抽象工厂方法解决了
 * 同一个产品族的问题。
 *
 * @author zhangsunjiankun - 2019/5/18 上午8:18
 */
public class Main {

    public static void main(String[] args) {
//        ComputerFactory amdComputerFactory = new AmdComputerFactory();
//        CPU amdCpu = amdComputerFactory.makeCpu();
//        MainBoard amdMainBoard = amdComputerFactory.makeMainBoard();
//        Computer computer = new Computer(amdCpu, amdMainBoard);
//        System.out.println(computer);

        ComputerFactory interComputerFactory = new InterComputerFactory();
        CPU amdCpu = interComputerFactory.makeCpu();
        MainBoard amdMainBoard = interComputerFactory.makeMainBoard();
        Computer computer = new Computer(amdCpu, amdMainBoard);
        System.out.println(computer);

    }
}
