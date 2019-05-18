package com.example.designprinciple.abstractfactory;

import com.example.designprinciple.abstractfactory.cpu.AmdCpu;
import com.example.designprinciple.abstractfactory.cpu.CPU;
import com.example.designprinciple.abstractfactory.cpu.CPUSpec;
import com.example.designprinciple.abstractfactory.mainboard.AmdMainBoard;
import com.example.designprinciple.abstractfactory.mainboard.MainBoard;
import com.example.designprinciple.abstractfactory.mainboard.MainBoardSpec;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午9:08
 */
public class AmdComputerFactory implements ComputerFactory {

    @Override
    public CPU makeCpu() {
        return new AmdCpu(CPUSpec.S1);
    }

    @Override
    public MainBoard makeMainBoard() {
        return new AmdMainBoard(MainBoardSpec.M1);
    }

}
