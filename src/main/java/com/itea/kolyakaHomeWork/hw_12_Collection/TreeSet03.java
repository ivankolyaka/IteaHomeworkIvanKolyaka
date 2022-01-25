package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSet03  {



    public static void main(String[] args) {

        HeavyBox heavyBox1 = new HeavyBox(1,3.5);
        HeavyBox heavyBox2 = new HeavyBox(2,5.5);
        HeavyBox heavyBox3 = new HeavyBox(3,10.5);

        TreeSet<HeavyBox> heavyBoxTreeSet = new TreeSet<>();

        heavyBoxTreeSet.add(heavyBox1);
        heavyBoxTreeSet.add(heavyBox2);
        heavyBoxTreeSet.add(heavyBox3);


        for (HeavyBox hb: heavyBoxTreeSet
        ) {
            System.out.println(hb);
        }

    }
}
