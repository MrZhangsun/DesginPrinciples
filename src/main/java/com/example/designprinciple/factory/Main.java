package com.example.designprinciple.factory;

/**
 * Function: 工厂模式解决了对于同一个实例的创建存在多个工厂的问题。
 * 以购买云主机为例子，之前只有亚马逊一家独大的时候，我们购买云主机只能从亚马逊一家去买，从而使用简单工厂模式即可，我们只需要提供
 * 云主机的配置，就可以得到相应的云主机。
 * 最后，由于出现了更多的厂家，例如：Alibaba， Tencent等，因此我们有了更多的选择。此时如果我们想根据不同应用的特点选择不同厂家生产的
 * 云主机，此时就需要多个生产商。简单工厂就没有办法实现这个需求。因此出现了工厂模式。
 *
 * 工厂模式便于扩展，新增工厂只需添加相应的工厂类即可. 工厂方法设计模式解决了不同产品等级的问题。
 *
 *
 * @author zhangsunjiankun - 2019/5/18 上午8:04
 */
public class Main {
    public static void main(String[] args) {
        CPUFactory cpuFactory = new AlibabaCPUFactory();
        CPUEnums amdCpu = CPUEnums.AMD;
        CPU cpu = cpuFactory.makeCPU(amdCpu);
        System.out.println(cpu.getName());
    }
}
