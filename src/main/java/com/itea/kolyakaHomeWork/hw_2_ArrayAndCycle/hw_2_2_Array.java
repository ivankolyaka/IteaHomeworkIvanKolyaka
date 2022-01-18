package com.itea.kolyakaHomeWork.hw_2_ArrayAndCycle;

import java.util.Arrays;
import java.util.Random;

public class hw_2_2_Array {
    public static void main(String[] args) {
        {
            Random random = new Random();
            int[] arr = new int[8];
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(arr));
            int i = 1;
            while (i <= arr.length - 1) {
                arr[i] = 0;
                i = i + 2;
            }
            System.out.println(Arrays.toString(arr));
        }

        {
            Random random = new Random();
            int[] arr = new int[12];
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = random.nextInt(-15,15);
            }
            System.out.println(Arrays.toString(arr));
            int maxEl=arr[0]; int ind=0;
            for (int i = 1; i <= arr.length - 1; i++) {
                if (arr[i] >= maxEl)
                {  maxEl =arr[i]; ind=i;}
            }
            System.out.println("максимальный элемент: " + arr[ind]  + " с индексом " + ind);
        }

        {
            int[] arr = new int[4];
            Random rand = new Random();
            for (int i=0; i<=arr.length-1; i++)
            {arr[i]=rand.nextInt(10,99);}
            System.out.println(Arrays.toString(arr));

            boolean isGrow= true; int i=0;
            while (isGrow==true && i<=arr.length-2) {
                if (arr[i+1]<arr[i]) {isGrow=false; break;}
                i++;
            }
            System.out.println(isGrow?"массив строго растущий":"массив не строго растущий");
        }

        {
            String[] arr = new String[]{ "aa", "bb", "cc", "dd","zzz","mmm"};
            String t; int mediana=arr.length/2; int maxIndex=arr.length-1;
            for (int i=0;i<=mediana-1; i++)
            {
                t=arr[i];
                arr[i]=arr[maxIndex-i];
                arr[maxIndex-i]=t;
            }
            System.out.println(Arrays.toString(arr));
        }

        {
            Random random = new Random();
            int[] arrA = new int[5];int[] arrB = new int[5];
            int sumA=0; int sumB=0;
            for (int i = 0; i <= 5 - 1; i++) {
                arrA[i] = random.nextInt(0,5); sumA=sumA+arrA[i];
                arrB[i] = random.nextInt(0,5); sumB=sumB+arrB[i];
            }
            double avrgA = (double)sumA/(arrA.length);
            double avrgB = (double)sumB/(arrB.length);
            System.out.println(Arrays.toString(arrA));
            System.out.println("среднее значение массива А = " + avrgA);
            System.out.println(Arrays.toString(arrB));
            System.out.println("среднее значение массива B = " + avrgB);

            if (avrgA>avrgB){ System.out.println("среднее значение массива А больше чем массива B "); }
            else if (avrgA<avrgB){ System.out.println("среднее значение массива A меньше чем массива B "); }
            else {System.out.println("среднее значение массива A и B равны");}

        }
    }
}
