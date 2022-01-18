package com.itea.kolyakaHomeWork.hw_7_EncapsulationAndObject;

import java.io.*;
import java.util.Scanner;

public class UserInfo implements Serializable {
    private transient String userName;
    private transient String password;

    public UserInfo() {
        this.userName = "ivan";
        this.password = "qwerty";
    }

    public UserInfo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /*    public UserInfo(UserInfo userInfo) {
        this.userName = userInfo.getUserName();
        this.password = userInfo.getPassword();
    }*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean loginCheck (UserInfo usr1, UserInfo usr2)
    {
        if (usr1.getUserName().equals(usr2.getUserName()) && usr1.getPassword().equals(usr2.getPassword()))
        {return true;}
        else
        {return false;}
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserInfo userInApp = new UserInfo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("введите логин");
        String login = scanner.next();
        System.out.println("введите пароль");
        String password = scanner.next();

        //UserInfo userForCheck = new UserInfo(login,password);
        //** в учебных целях получим копию объекта через стрим, хотя было бы проще через клон или просто новый объект

        ByteArrayOutputStream bArrOutStream = new ByteArrayOutputStream();
        ObjectOutputStream oOutStream = new ObjectOutputStream(bArrOutStream);

        // по сути записываем пустой объект, т.к. оба поля прописал как transient
        oOutStream.writeObject(userInApp);
        oOutStream.close();

        byte[] arrayBytes = bArrOutStream.toByteArray();

        ByteArrayInputStream baiStream = new ByteArrayInputStream(arrayBytes);
        ObjectInputStream oInStream = new ObjectInputStream(baiStream);

        UserInfo userForCheck = (UserInfo) oInStream.readObject();
        userForCheck.setUserName(login);
        userForCheck.setPassword(password);

        Boolean isCorrect = loginCheck (userInApp, userForCheck);
        System.out.println(isCorrect?"имя и пароль совпадают":"имя и пароль не совпадают");

    }
}
