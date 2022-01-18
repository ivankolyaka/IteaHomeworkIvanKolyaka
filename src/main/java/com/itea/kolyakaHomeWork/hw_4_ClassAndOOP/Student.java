package com.itea.kolyakaHomeWork.hw_4_ClassAndOOP;

public class Student extends People {
    protected String faculty;
    protected  int averageRating;
    protected int yearAdmission;

    protected Student(){
        super();
    }
    protected Student(int idPeople, String firstName, String secondName, String faculty,int averageRating,int yearAdmission) {
        super(idPeople, firstName, secondName);
        this.faculty = faculty;
        this.averageRating=averageRating;
        this.yearAdmission=yearAdmission;
    }

    @Override
    protected void getPeopleInfo()
    {
        super.getPeopleInfo();
        System.out.println("факультет: " + faculty + " рейтинг: " + averageRating + "; год поступления: " + yearAdmission );
    }


    public String toString()
    {
        return "Студент : " + this.secondName + " " + this.firstName + ", рейтинг - " + averageRating ;
    }


}
