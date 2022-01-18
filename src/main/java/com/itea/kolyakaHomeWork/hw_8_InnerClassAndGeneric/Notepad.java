package com.itea.kolyakaHomeWork.hw_8_InnerClassAndGeneric;

import java.util.ArrayList;
import java.util.Date;

public class Notepad {
    int id;
    Date date;
    String noteName;
    ArrayList<ToDoTask> toDoTaskList;
    private class ToDoTask {
        int subId;
        String subTask;
    }
}
