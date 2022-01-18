package com.itea.kolyakaHomeWork.hw_4_ClassAndOOP;

public class People implements Comparable<People> {
    protected int idPeople;
    protected String firstName;
    protected String secondName;

    protected People(){
        this.firstName="";
        this.secondName="";
    }

    protected People( int idPeople, String firstName,String secondName ){
        this.idPeople=idPeople;
        this.firstName=firstName;
        this.secondName=secondName;
    }

    protected void getPeopleInfo()
    {
        System.out.println("id: " + idPeople + " Имя: " + firstName + "; Фамилия:" + secondName );
    }


    @Override
    public int compareTo(People o) {
        return this.secondName.compareToIgnoreCase(o.secondName);
    }
}
