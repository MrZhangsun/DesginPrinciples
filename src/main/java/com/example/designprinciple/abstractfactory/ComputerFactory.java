package com.example.designprinciple.abstractfactory;

import com.example.designprinciple.abstractfactory.cpu.CPU;
import com.example.designprinciple.abstractfactory.mainboard.MainBoard;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午9:10
 */
public interface ComputerFactory {

    CPU makeCpu();

    MainBoard makeMainBoard();
}
