package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ExchangeFirstAndLastWord10 {
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

    //полагаем что в слове может быть любой символ(даже не буквенно цифровой)
    protected static String strUpd(String inputString)
    {
        String updatedStr="";
        LinkedList<String> linkedList = new LinkedList<>();

        for (  String currWord: inputString.split("\\s")  )
        {
            linkedList.add(currWord);
        }
        int maxIndexWord=linkedList.size();
        if(linkedList.size()>1){
            String tmp = linkedList.getFirst();
            linkedList.set(0,linkedList.getLast());
            linkedList.set(maxIndexWord-1,tmp);
            for (String wrd: linkedList
            ) {
                updatedStr=updatedStr+"\s"+wrd;
            }
        }else updatedStr=inputString;

        return updatedStr;
    }
}
