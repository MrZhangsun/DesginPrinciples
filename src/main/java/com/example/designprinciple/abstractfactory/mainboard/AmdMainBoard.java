package com.example.designprinciple.abstractfactory.mainboard;

/**
 * Function:
 *
 * @author zhangsunjiankun - 2019/5/18 上午9:16
 */
public class AmdMainBoard implements MainBoard {

    private MainBoardSpec mainBoardSpec;

    public AmdMainBoard(MainBoardSpec mainBoardSpec) {
        this.mainBoardSpec = mainBoardSpec;
    }

    @Override
    public String toString() {
        return "AmdMainBoard{" +
                "mainBoardSpec=" + mainBoardSpec +
                '}';
    }

    @Override
    public String name() {
        return toString();
    }
}
