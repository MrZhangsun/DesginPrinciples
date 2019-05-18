package com.example.designprinciple.abstractfactory.cpu;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午9:06
 */
public class AmdCpu implements CPU {
    private CPUSpec cpuSpec;

    public AmdCpu(CPUSpec cpuSpec) {
        this.cpuSpec = cpuSpec;
    }

    @Override
    public String toString() {
        return "AmdCpu{" +
                "cpuSpec=" + cpuSpec +
                '}';
    }

    @Override
    public String name() {
        return "Amd CPU Spec: " + this.cpuSpec;
    }
}
