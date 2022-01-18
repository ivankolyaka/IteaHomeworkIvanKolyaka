package com.itea.kolyakaHomeWork.hw_1_Sort;

public class Hw_1_2_SortThreeNumber {
    public static void main(String[] args) {
        //int a=5,b=4,c=2;
        //int a=4,b=5,c=2;
        int a=5,b=2,c=4;

        int x;

        if (a>b){x=a; a=b; b=x;}
        if (c<a){x=c;c=b;b=a;a=x;}
        else if (c>a&&c<b){x=b;b=c;c=x;}

        System.out.println("имея int a="+a+" ,b= " +b+",c=" +c+";");
        System.out.println("получим " + a + " " +b+" " +c);


    }
}
