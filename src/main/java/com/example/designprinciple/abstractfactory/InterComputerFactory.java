package com.example.designprinciple.abstractfactory;

import com.example.designprinciple.abstractfactory.cpu.CPU;
import com.example.designprinciple.abstractfactory.cpu.CPUSpec;
import com.example.designprinciple.abstractfactory.cpu.InterCpu;
import com.example.designprinciple.abstractfactory.mainboard.InterMainBoard;
import com.example.designprinciple.abstractfactory.mainboard.MainBoard;
import com.example.designprinciple.abstractfactory.mainboard.MainBoardSpec;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午9:08
 */
public class InterComputerFactory implements ComputerFactory{

    @Override
    public CPU makeCpu() {
        return new InterCpu(CPUSpec.S2);
    }

    @Override
    public MainBoard makeMainBoard() {
        return new InterMainBoard(MainBoardSpec.M2);
    }
}
