package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UpperCaseForLongWord04 {
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

        Pattern pattern = Pattern.compile("\\w{3,}");
        Matcher matcher = pattern.matcher(inputString);
        int curr =0;
        while (matcher.find())
        {
            int i = matcher.start();
            updatedStr=updatedStr+inputString.substring(curr,i)+matcher.group().toUpperCase();
            curr=matcher.end();
        }
        updatedStr=updatedStr+inputString.substring(curr);

        return updatedStr;
    }



}
