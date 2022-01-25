package com.itea.kolyakaHomeWork.hw_12_Collection;

import java.util.*;

public class StudentCollection09 {


    public static void main(String[] args) {
        Student student1 = new Student("viktor","1",3, 4.5F);
        Student student2 = new Student("ivan","2",4, 3.5F);
        Student student3 = new Student("petro","2",2, 2.5F);
        Student student4 = new Student("marko","2",2, 3.5F);

        List<Student> studentCollection = new LinkedList<>();
        studentCollection.add(student1);
        studentCollection.add(student2);
        studentCollection.add(student3);
        studentCollection.add(student4);

        System.out.println(studentCollection);

        printStudents(studentCollection, 2);
        updateStudent(studentCollection);
        System.out.println("after update ");
        printStudents(studentCollection, 3);
    }

    public static List<Student> updateStudent(List<Student> studentsLst) {
        List<Student> studentListForDel = new LinkedList<>();
        for (Student student : studentsLst
        ) {
            if (student.rate < 3) {
                studentListForDel.add(student);
            } else {
                student.course += 1;
            }
        }
        if(studentListForDel.size()>0){
            studentsLst.removeAll(studentListForDel);
        }
        return studentsLst;
    }

    public static void printStudents(List<Student> students, int course){
        for (Student student: students
             ) {
            if (student.course==course)
            {System.out.println(student.name);}
        }

    }
}


class Student {
    String name;
    String group;
    int course;
    float rate;

    public Student(String name, String group,int course, float rate) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", rate=" + rate +
                '}';
    }
}
