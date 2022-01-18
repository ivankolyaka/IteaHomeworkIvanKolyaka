package com.itea.kolyakaHomeWork.hw_10_Exception;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usrLogin, usrPassword, usrConfirmPassword;
        System.out.println("input login");
        usrLogin = scanner.next();
        System.out.println("input password");
        usrPassword = scanner.next();
        System.out.println("confirm password");
        usrConfirmPassword = scanner.next();

        System.out.println(checkPasswordConfirm(usrLogin, usrPassword, usrConfirmPassword) ? "все ок" : "что-то не так");
    }

    public static boolean checkPasswordConfirm(String login, String password, String confirmPassword) {

        Pattern pattern = Pattern.compile("[A-Za-z0-9_]{1,20}");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);
        try {
            if (!matcherLogin.matches()) {
                throw new WrongLoginException("некорректный логин");
            }
            if (!matcherPassword.matches() || !password.equals(confirmPassword)) {
                throw new WrongPasswordException ("некорректный пароль или пароли не совпадают");
            }

            return (password.equals(confirmPassword)) ? true : false;
        }
        catch (WrongLoginException e) {
            System.out.println(e.getMessage()); //e.printStackTrace();
            return false;
        }
        catch (WrongPasswordException e) {
            System.out.println(e.getMessage()); //e.printStackTrace();
            return false;
        }


    }
}
