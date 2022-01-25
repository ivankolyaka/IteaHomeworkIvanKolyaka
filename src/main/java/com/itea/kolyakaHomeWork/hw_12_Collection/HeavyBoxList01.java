package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.ArrayList;

public class HeavyBoxList01 {
//    private ArrayList<HeavyBox> heavyBoxArrayList;
//
//    public HeavyBoxList() {
//        this.heavyBoxArrayList = new ArrayList<>();
//    }

    public static void printHeavyBoxList(ArrayList<HeavyBox> hbl) {
        if (hbl.size()>0) {
            for (HeavyBox hb : hbl
            ) {
                System.out.println(hb);
            }
        }
        else {
            System.out.println("элемены отсутствуют");
        }
    }


    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(1,3.5);
        HeavyBox heavyBox2 = new HeavyBox(2,5.5);
        HeavyBox heavyBox3 = new HeavyBox(3,10.5);

        ArrayList<HeavyBox> heavyBoxArrayList = new ArrayList<>();

        heavyBoxArrayList.add(heavyBox1);
        heavyBoxArrayList.add(heavyBox2);
        heavyBoxArrayList.add(heavyBox3);

//        for (HeavyBox hb: heavyBoxArrayList
//             ) {
//            System.out.println(hb);
//        }
        printHeavyBoxList(heavyBoxArrayList);

        int lastHeavyBoxIndex = heavyBoxArrayList.size()-1; // можно было бы через lastIndexOf(heavyBoxArrayList)
        heavyBoxArrayList.remove(lastHeavyBoxIndex);
        System.out.println("after delete last");
        printHeavyBoxList(heavyBoxArrayList);

        heavyBoxArrayList.removeAll(heavyBoxArrayList);
        System.out.println("after delete all");
        printHeavyBoxList(heavyBoxArrayList);

    }
}
