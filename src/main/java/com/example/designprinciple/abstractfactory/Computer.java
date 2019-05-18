package com.example.designprinciple.abstractfactory;

import com.example.designprinciple.abstractfactory.cpu.CPU;
import com.example.designprinciple.abstractfactory.mainboard.MainBoard;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午11:02
 */
public class Computer {

    private CPU cpu;

    private MainBoard mainBoard;

    public Computer(CPU cpu, MainBoard mainBoard) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", mainBoard=" + mainBoard +
                '}';
    }
}
