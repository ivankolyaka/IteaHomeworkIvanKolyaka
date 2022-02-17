package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;

public class ReversStrInFile03 {
    public static void main(String[] args) {
        File fileSource = new File("data"+File.separator +"Student.java");
        File fileDestination = new File("data"+File.separator +"StudentReversed.txt");
        PrintWriter printWriter =null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(fileSource));
            String contentForUpd=""; String tmp;
            while ((tmp=bufferedReader.readLine())!=null){
                StringBuilder stringBuilder = new StringBuilder(tmp);
                stringBuilder.reverse();
                contentForUpd=contentForUpd+"\n"+stringBuilder.toString();
            }
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(fileDestination)));
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
}
