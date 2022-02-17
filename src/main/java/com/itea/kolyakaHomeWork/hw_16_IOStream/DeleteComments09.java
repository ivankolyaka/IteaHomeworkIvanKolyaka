package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteComments09 {
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
        String updatedStr="";

        Pattern pattern = Pattern.compile("//");
        Matcher matcher = pattern.matcher(inputString);

        if (matcher.find())
        {
            int i = matcher.start();
            updatedStr=inputString.substring(0,i);
        }else{
        updatedStr=inputString;
        }

        return updatedStr;
    }



}
