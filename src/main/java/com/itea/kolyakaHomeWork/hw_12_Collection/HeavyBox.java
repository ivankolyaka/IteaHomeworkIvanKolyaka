package com.itea.kolyakaHomeWork.hw_12_Collection;

public class HeavyBox implements Comparable<HeavyBox> {
    int idHeavyBox;
    double weightHeavyBox;

    @Override
    public String toString() {
        return "HeavyBox{" +
                "idHeavyBox=" + idHeavyBox +
                ", weightHeavyBox=" + weightHeavyBox +
                '}';
    }

    public HeavyBox(int idHeavyBox, double weightHeavyBox) {
        this.idHeavyBox=idHeavyBox;
        this.weightHeavyBox = weightHeavyBox;
    }

    @Override
    public int compareTo(HeavyBox hb) {
        {
            return -((Double)weightHeavyBox).compareTo(hb.weightHeavyBox);
            //return (weightHeavyBox>hb.weightHeavyBox)?-1:1;
        }
    }
}
