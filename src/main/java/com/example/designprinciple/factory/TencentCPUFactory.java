package com.example.designprinciple.factory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:53
 */
public class TencentCPUFactory implements CPUFactory {
    @Override
    public CPU makeCPU(CPUEnums cpu) {
        switch (cpu) {
            case AMD:
                return new TencentAmdCpu();
            case INTER:
                return new TencentInterCpu();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
