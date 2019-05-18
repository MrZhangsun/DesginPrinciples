package com.example.designprinciple.abstractfactory.mainboard;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午11:15
 */
public class InterMainBoard implements MainBoard{
    private MainBoardSpec mainBoardSpec;
    private final String name = "Inter Main Board";

    public InterMainBoard(MainBoardSpec mainBoardSpec) {
        this.mainBoardSpec = mainBoardSpec;
    }

    @Override
    public String toString() {
        return "InterMainBoard{" +
                "mainBoardSpec=" + mainBoardSpec +
                '}';
    }

    @Override
    public String name() {
        return this.name;
    }
}
