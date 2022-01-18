package com.itea.kolyakaHomeWork.hw_6_Interface;

public class Main {
    public static void main(String[] args) {
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        ConverterAll converterAll = new ConverterAll(celsiusConverter);
        double tempGradForConvert = 10;
        converterAll.convertToAll(tempGradForConvert);
    }
}
