package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Split04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input str");
        String inputString = scanner.next();
        String[] arrStr = inputString.split(",");

        Set<String> set = new HashSet<>();

        for (int i=0; i<= arrStr.length-1; i++){
            set.add(arrStr[i]);
        }

        String result="";
        for (String item: set
        ) {
            result=result+ ","+ item;
         }
        System.out.println(result.substring(1));
    }
}
