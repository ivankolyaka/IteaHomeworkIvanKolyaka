package com.itea.kolyakaHomeWork.hw_16_IOStream;

import java.io.*;

public class DeleteDoubleSpaceTab08 {
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
        inputString=inputString.replaceAll("\\t+"," ");
        inputString=inputString.replaceAll("\\s{2,}"," ");

        return inputString;
    }
}
