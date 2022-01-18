package com.itea.kolyakaHomeWork.hw_4_ClassAndOOP;

import java.util.Scanner;

public class Hw_4_ClassPeopleAndStudent {
    public static void main(String[] args) {

        People people = new People(1,"ivan", "ivanov");
        people.getPeopleInfo();

        Student student =new Student(2,"Петр","Петров","кибернетики",4,2000);
        System.out.println(student.toString());

        Group group = new Group(10);

        System.out.println("добавить нового студенте в группу? Y/N");
        Scanner in = new Scanner(System.in);
        while (in.next().equalsIgnoreCase("y"))
        {
            group.addStudent();
            System.out.println("добавить нового студенте в группу? Y/N");
        }
        System.out.println("студенты группы в алфавитном порядке:");
        System.out.println(group.toString());

    }
}
