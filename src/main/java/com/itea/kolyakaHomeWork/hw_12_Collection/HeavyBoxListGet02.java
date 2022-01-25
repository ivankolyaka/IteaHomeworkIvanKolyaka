package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class HeavyBoxListGet02 {

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

        System.out.println("первый способ вывода");
        for (HeavyBox hb: heavyBoxArrayList
             ) {
            System.out.println(hb);
        }
        System.out.println("второй способ вывода");
        printHeavyBoxList(heavyBoxArrayList);

        System.out.println("третий способ вывода");
        HeavyBox[] hbArr = new HeavyBox[heavyBoxArrayList.size()];
        hbArr = heavyBoxArrayList.toArray(hbArr);
        for (int i=0; i<=hbArr.length-1; i++){
            HeavyBox hb = hbArr[i];
            System.out.println(hb);
        }
        System.out.println("четвертый способ вывода");
        ListIterator listIterator = heavyBoxArrayList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("пятый способ вывода");
        Iterator iterator = heavyBoxArrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
