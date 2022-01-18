package com.itea.kolyakaHomeWork.hw_6_Interface;

public class CelsiusConverter implements ITemperatureConverter {

    private double result;
    @Override
    public double convert(double celsiusValue, String scale) {
        switch (scale) {
            case "FAHRENHEIT" : result = celsiusValue * F1 +F2; break;
            case "CELSIUS" :  result = celsiusValue; break;
            case "KELVIN" :  result =  celsiusValue + 273.15; break;
            // Вопрос - почему если везде убрать break всегда будет 283,15 ???????
            //default:{result = null;} как можно написать что-то подобное? Через новый тип?
        }

        return result;
    }
}
