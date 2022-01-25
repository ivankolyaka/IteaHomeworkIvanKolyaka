package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntersect05 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();

        set1.add("xxx");
        set1.add("bbb");
        set1.add("aaa");
        set1.add("ccc");

        set2.add("yyy");
        set2.add("bbb");
        set2.add("aaa");
        set2.add("ccc");
        set2.add("ddd");

        Set<String> setIntersection = new TreeSet<>(set1);
        setIntersection.retainAll(set2);
        System.out.println("***Intersection***");
        for (String s:setIntersection
             ) {
            System.out.println(s);
        }

        Set<String> setUnion = new TreeSet<>(set1);
        setUnion.addAll(set2);
        System.out.println("***union***");
        for (String s:setUnion
        ) {
            System.out.println(s);
        }



    }
}
