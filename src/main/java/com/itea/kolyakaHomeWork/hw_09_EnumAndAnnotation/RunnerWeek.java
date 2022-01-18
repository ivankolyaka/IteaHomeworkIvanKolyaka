package com.itea.kolyakaHomeWork.hw_09_EnumAndAnnotation;

public class RunnerWeek {

    public static void main(String[] args) {
        for (Weekday wdv: Weekday.values()){ checkDay(wdv); }
    }

    static void checkDay(Weekday wd){
            System.out.println(wd.toString()+" - " + ((wd.isWeekDay())?"рабочий":"выходной") +" день");
    }

}
