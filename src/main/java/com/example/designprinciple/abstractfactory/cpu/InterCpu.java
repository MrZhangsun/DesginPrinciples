package com.example.designprinciple.abstractfactory.cpu;


/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午9:07
 */
public class InterCpu implements CPU {
    private CPUSpec cpuSpec;
    private final String name = "Inter CPU";

    public InterCpu(CPUSpec cpuSpec) {
        this.cpuSpec = cpuSpec;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String toString() {
        return "InterCpu{" +
                "cpuSpec=" + cpuSpec +
                ", name='" + name + '\'' +
                '}';
    }
}
