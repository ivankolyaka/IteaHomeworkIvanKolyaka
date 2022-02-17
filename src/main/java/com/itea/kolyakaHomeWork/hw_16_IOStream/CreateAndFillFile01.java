package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class CreateAndFillFile01 {
    public static void main(String[] args) {
        String digitSet = "";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(100);
            digitSet = a + " " + digitSet;
        }
        File file = new File("data\"+File.separator +\"digits.txt");
        BufferedReader bufferedReader = null;

        try (FileWriter fileWriter = new FileWriter(file)) {
            //FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(digitSet);
            fileWriter.flush();//добавил, т.к. закрытие только в финал блоке и файл еще не записан
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String res = bufferedReader.readLine(); //полагаем, что есть только одна строка
            System.out.println(res);

            String[] arrOfDigit = res.split("\s");
            int[] arrOfInt = new int[arrOfDigit.length];
            for (int i = 0; i <= arrOfInt.length - 1; i++) {
                arrOfInt[i] = Integer.parseInt(arrOfDigit[i]);
            }

            Arrays.sort(arrOfInt);
            res = "";
            for (int i = 0; i <= arrOfInt.length - 1; i++) {
                res = res + ", " + arrOfInt[i];
            }
            res = res.substring(2);

            fileWriter.write(res);
            fileWriter.flush();
            res = bufferedReader.readLine();
            System.out.println("after sorting");
            System.out.println(res);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
