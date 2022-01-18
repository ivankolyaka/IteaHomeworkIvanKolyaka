package com.itea.kolyakaHomeWork.hw_4_ClassAndOOP;

import java.util.Arrays;
import java.util.Scanner;

public class Group {

    protected  Student[] arrayStudents;
    private Scanner scanner;

    protected Group(int groupSize){
        arrayStudents = new Student[groupSize];
        scanner = new Scanner(System.in);
        for (int i=0; i<=groupSize-1; i++){
            arrayStudents[i] = new Student();
        }
    }

    protected void addStudent()
    {
        Student newStudent = new Student();
        System.out.print("Введите id от 1 до 10 : ");   newStudent.idPeople=scanner.nextInt();
        System.out.print("Введите имя: ");   newStudent.firstName=scanner.next();
        System.out.print("Введите : ");   newStudent.secondName=scanner.next();
        System.out.print("Введите факультет: ");   newStudent.faculty=scanner.next();
        System.out.print("Введите рейтинг: ");   newStudent.averageRating=scanner.nextInt();
        System.out.print("Введите год поступления: ");   newStudent.yearAdmission=scanner.nextInt();

        arrayStudents[newStudent.idPeople-1]=newStudent;
     }

    protected void deleteStudent(int idPeopleForDelete)
    {   //не добавлял проверки на наличие индекса
        Student[] arrayStudentsTmp = new Student[arrayStudents.length-1] ;
        for (int i=0, k=0; i<=arrayStudents.length-1; i++) {
            if (i==idPeopleForDelete)
            {continue;}
            arrayStudentsTmp[k++]=arrayStudents[i];
        }
        arrayStudents=arrayStudentsTmp;
    }

    protected void findStudentBySecondName(String secondName)
    {
        for (int i=0 ; i<=arrayStudents.length-1; i++) {
            if (arrayStudents[i].secondName==secondName)
                System.out.println("Студент с фамилией " + secondName + " найден. " );
        }
    }

    @Override
    public String toString() {
        String orderedStudentOfGroup="";
        Arrays.sort(arrayStudents);
        for(Student s:arrayStudents)
        {
            orderedStudentOfGroup += s.toString() + "\n";
        }
        return orderedStudentOfGroup;
    }
}
