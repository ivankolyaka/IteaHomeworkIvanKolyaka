package com.itea.kolyakaHomeWork.hw_6_Interface;

public interface ITemperatureConverter {
    double CELS = 0;
    double KELV = 273.15;
    double F1 =1.8, F2=32;



    double convert(double sourceValue, String scaleToConvert);
}
