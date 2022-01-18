package com.itea.kolyakaHomeWork.hw_2_ArrayAndCycle;

import java.util.Scanner;

public class hw_2_1_CycleAndArray {

    public static void main(String[] args) {
        for (int i=1;i<=5; i++)
        {
            System.out.print(i +" ");
        }
        System.out.println("");
        for (int i=5;i>=1; i--)
        {
            System.out.print(i+ " ");
        }
        System.out.println("\n");

        for (int i =1;i<=10; i++)
        {
            System.out.println("3 * " + i + " = " + 3 * i );
        }

        {
            int x;
            int result;
            System.out.println("введите число");

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                if (x > 0) {
                    result = x;
                    for (int i = result; i >= 1; i--) {
                        result = result + i - 1;
                    }
                    System.out.println("сумма чисел от 1 до " + x + " = " + result);
                } else {
                    System.out.println("number must be > 0!");
                }

            } else {
                System.out.println("must be integer!!!");
            }
        }

        {
            System.out.println("\n");
            int i=7;
            while (i<=98)
            {
                System.out.print(i+ " ");
                i=i+7;
            }
            System.out.println("");
         }
        {
            Integer i=2;
            String result="";
            while (i<=512)
            {
                result = result + ((i==2)?"":" ") + i;
                i=i*2;
            }
            System.out.println(result);
        }

         /*{
            int attempt = 1;
            System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();

            while (attempt <= 3) {
                if (userAnswer.equalsIgnoreCase("тролейбус")) {
                    System.out.println("Правильно!");
                    break;
                } else if (userAnswer.equalsIgnoreCase("сдаюсь")) {
                    System.out.println("Правильный ответ: тролейбус");
                    break;
                } else {
                    if (attempt < 3) {
                        System.out.println("подумайте");
                    } else {
                        System.out.println("Вы не угадали с трех попыток. Ответ: тролейбус");
                        break;
                    }
                }
                attempt++;
                System.out.println("попытка № " + attempt);
                userAnswer = scanner.next();
            }

        }*/

        {
            int attempt = 1;
            System.out.println("Что это есть такое: синий, большой, с усами и полный зайцев?");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();

            w:
            while (attempt <= 3) {
                switch (userAnswer) {
                    case "тролейбус": {
                        System.out.println("Правильно!");
                        break w;}
                      case "сдаюсь": {
                        System.out.println("Правильный ответ: тролейбус");
                        break w;}
                    default: {
                        if (attempt < 3) {
                            System.out.println("подумайте");
                        } else {
                            System.out.println("Вы не угадали с трех попыток. Ответ: тролейбус");
                            break w;
                        }
                    }
                }
                attempt++;
                System.out.println("попытка № " + attempt);
                userAnswer = scanner.next();
            }

        }
    }


}
