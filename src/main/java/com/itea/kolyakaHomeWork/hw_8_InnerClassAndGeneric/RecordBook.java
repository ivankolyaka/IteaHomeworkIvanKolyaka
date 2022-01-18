package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;
import java.util.Date;

public class RecordBook {
    int idRecordBook;
    String studentName;
    private class Session{

        private class Exam{
            String examName;
            Date examDate;
            int grade;
        }
        private class Test{
            String testName;
            Date testDate;
            boolean isPass;
        }

        ArrayList<Exam> examList;
        ArrayList<Test> testList;
    }
    ArrayList<Session> sessionList;
}
