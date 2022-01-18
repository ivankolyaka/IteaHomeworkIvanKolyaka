package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;

public class Department {
    int idDepartment;
    String departmentName;
    class Position {
        int idPosition;
        String positionName;
    }
    class Employee {
        int idEmployee;
        String employeeName;
        Position position;
    }
    ArrayList<Position> positionList;
    ArrayList<Employee> employeeList;
}
