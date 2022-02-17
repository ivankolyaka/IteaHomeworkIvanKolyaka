package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteWordByLenght07 {
    public static void main(String[] args) {
        File file = new File("data"+File.separator +"StudentReversed.txt");
        PrintWriter printWriter =null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String contentForUpd=""; String tmp;
            while ((tmp=bufferedReader.readLine())!=null){
                 contentForUpd=contentForUpd+"\n"+strUpd(tmp);
            }
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
            printWriter.write(contentForUpd);

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(printWriter!=null){
                printWriter.close();
            }
        }
    }

    protected static String strUpd(String inputString)
    {
        String updatedStr=inputString;
        String currWordWithoutSpecialChar;
        ArrayList<String> arrayListForDelete = new ArrayList<>();
        int numberMatch=0;
        for (  String currWord: inputString.split("[\\s]")  )
        {
            currWordWithoutSpecialChar = currWord;
            currWordWithoutSpecialChar.replaceAll("\\W","");
            if (currWordWithoutSpecialChar.length()>=3 && currWordWithoutSpecialChar.length()<=5 )
            {
                arrayListForDelete.add(currWord);
            }
        }
        String[] arrayForDelete = new String[arrayListForDelete.size()];
        arrayForDelete = arrayListForDelete.toArray(arrayForDelete);
        int maxNumberMatch = arrayListForDelete.size();
        int maxIndexWordForDel = (maxNumberMatch%2==0)?maxNumberMatch:(maxNumberMatch-1);

        //StringBuilder stringBuilder = new StringBuilder(inputString);
        for (int i=0; i<=maxIndexWordForDel-1; i++)
        {
            updatedStr = updatedStr.replaceFirst(arrayForDelete[i],"");
        }
        return updatedStr;
    }
}
