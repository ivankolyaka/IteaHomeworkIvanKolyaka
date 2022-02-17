package com.itea.kolyakaHomeWork.hw_16_IOStream;
import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataByType06 {
    public static void main(String[] args) {
        File file = new File("data"+File.separator +"symbol.txt");
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {
            String contentByType=""; String tmp; String datatype="";
            System.out.println("input type (char, String, int,float)");
            Scanner scanner = new Scanner(System.in);
            datatype = scanner.next();
            while ((tmp=bufferedReader.readLine())!=null){
                contentByType=strUpd(datatype,tmp);
                System.out.println(contentByType);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static String strUpd(String datatype, String inputString) {
        Pattern pattern;
        String updatedStr = "";
        switch (datatype) {
            case "char": pattern = Pattern.compile("[\\s][a-zA-Z][\\s]"); break;//не учитываем примыкание небуквенных символов
            case "string": pattern = Pattern.compile("[a-zA-Z]{2,}"); break;
            case "int": pattern = Pattern.compile("\\d+"); break; //будем находить целые даже как часть float
            case "float": pattern = Pattern.compile("\\d+\\.\\d+"); break;
            default: pattern = Pattern.compile(".*");  break;
        }
        Matcher matcher = pattern.matcher(inputString);
        while (matcher.find()) {
            updatedStr = updatedStr +" "+ matcher.group();
        }
        return updatedStr;
    }

}
