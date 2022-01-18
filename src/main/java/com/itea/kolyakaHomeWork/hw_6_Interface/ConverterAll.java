package com.itea.kolyakaHomeWork.hw_6_Interface;

public class ConverterAll {
    ITemperatureConverter tc;
    enum SCALES {FAHRENHEIT, CELSIUS, KELVIN};

    public ConverterAll(ITemperatureConverter tc) {
        this.tc = tc;
    }

    public void convertToAll(double valueForConvert){
        for( SCALES s : SCALES.values()){
            System.out.println("Значение в " + s + " = " + tc.convert(valueForConvert,s.toString()));
        }
    }
}
