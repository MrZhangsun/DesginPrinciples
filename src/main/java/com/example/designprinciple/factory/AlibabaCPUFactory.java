package com.example.designprinciple.factory;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午7:53
 */
public class AlibabaCPUFactory implements CPUFactory {
    @Override
    public CPU makeCPU(CPUEnums cpu) {
        switch (cpu) {
            case AMD:
                return new AlibabaAmdCpu();
            case INTER:
                return new AlibabaInterCpu();
            default:
                throw new UnsupportedOperationException();

        }
    }
}
