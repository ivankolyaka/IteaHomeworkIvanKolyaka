package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;

public class ReplacePublicOnPrivate02 {
    public static void main(String[] args) {
        File file = new File("data"+File.separator +"Student.java");
        PrintWriter printWriter =null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String contentForUpd=""; String tmp;
            while ((tmp=bufferedReader.readLine())!=null){
                contentForUpd=contentForUpd+"\n"+tmp;
            }
            contentForUpd=contentForUpd.replaceAll("public", "private");

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
}
