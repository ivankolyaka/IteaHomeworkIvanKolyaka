package com.itea.kolyakaHomeWork.hw_09_EnumAndAnnotation;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public Boolean isWeekDay(){
        return (this.toString()=="SATURDAY" || this.toString()=="SUNDAY")?false:true;
    }
    public Boolean isHoliday(){
        return !isWeekDay();
    }
}
