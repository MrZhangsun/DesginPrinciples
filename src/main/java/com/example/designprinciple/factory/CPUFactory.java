package com.example.designprinciple.factory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:52
 */
public interface CPUFactory {

    /**
     * 根据CPU名称生产CPU
     *
     * @param cpu name
     * @return CPU
     */
    CPU makeCPU(CPUEnums cpu);
}
