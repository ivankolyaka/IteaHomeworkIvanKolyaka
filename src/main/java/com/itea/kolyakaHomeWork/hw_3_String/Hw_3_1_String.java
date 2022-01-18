package com.itea.kolyakaHomeWork.hw_3_String;

import java.util.stream.IntStream;

public class Hw_3_1_String {
    public static void main(String[] args) {
// **** задача 1 ****
        {
            String str1 = new String("123ACA321");
            //String str1 = new String("123ABC");
            StringBuilder str2 = (new StringBuilder(str1)).reverse();
            String strReversed = new String(str2);

            //System.out.println(str1);
            //System.out.println(strReversed);

            if (str1.equals(strReversed)) {
                System.out.println("Your string:\"" + str1 + "\" is a palindrome");
            } else {
                System.out.println("Your string:\"" + str1 + "\" is not a palindrome");
            }
        }
        // *** 2 способ ***
//        {
//            String str1 = new String("123ACA321");
//            IntStream s= str1.chars();
//            char[] c = str1.toCharArray();
//            int tmp=c[0];
//            for (int i=0; i<=c.length/2; i++)
//            {
//
//            }
//        }

// **** задача 2 ****
        {
            String str1 = "PHP Exercises and ";
            String str2 = "Python Exercises";

            System.out.println("The concatenated string: " + str1.concat(str2));
        }
// **** задача 3 ****
        {
            String str1 = "This is exercise 1";
            String str2 = "This is Exercise 1";
            System.out.println(str1 + " is " + ((str1.equalsIgnoreCase(str2))?"":" not ") + "equal to "+ str2);

        }
// **** задача 4 ****
        {
            String str1 = "test string";
            String str2 = "".intern();
            char[] c = str1.toCharArray();
            int i=0; int maxind = c.length-1;
            while (i<=maxind)
            {
                if (c[i]==' ') {str2=str2+' '; i=i+1;}
                else
                {str2=str2+c[i]; i=i+2;}
            }

            System.out.println("The given string is: " + str1);
            System.out.println("The new string is:  " + str2);
        }


// **** задача 5 ****
        {
            String str2= "rabbit   bribe   dog";
            String str1 =  "bib";

            StringBuilder strBldrTmp =new StringBuilder("");
            StringBuilder strBldrResult =new StringBuilder("");
            //String str = str1.intern().chars().distinct().toString();//как-то так, если бы проверяли любое кол-во

            char[] arrChrToFind = str1.toCharArray(); //список симлов для поиска
            int numberChrToFind=arrChrToFind.length;
            int countChrToFind=0;
            String[] arrWrd = str2.split("\\s+"); //список слов в которых ищем символы

                for(int i=0; i<= arrWrd.length-1; i++) 
                {
                    countChrToFind=0;
                    strBldrTmp.setLength(0);
                    strBldrTmp.append(arrWrd[i]);

                    for(int j=0;j<= numberChrToFind-1; j++) {
                         if (strBldrTmp.indexOf("" + arrChrToFind[j]) >= 0) //contains(""+arrChr[i])) //вопрос - как можно по другому преобр в charSequence?
                        {
                            strBldrTmp.deleteCharAt(strBldrTmp.indexOf("" + arrChrToFind[j]));
                            countChrToFind ++;
                        }
                    }
                    if (countChrToFind==numberChrToFind)
                    {
                        strBldrResult.append(" " +arrWrd[i]);
                    }
                }

            System.out.println("The given strings are: " + str2);
            System.out.println("The given word is: " + str1);
            System.out.println("Result: " + strBldrResult);
        }

    }
}
