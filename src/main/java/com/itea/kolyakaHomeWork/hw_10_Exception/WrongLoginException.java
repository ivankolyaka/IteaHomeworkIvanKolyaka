package com.itea.kolyakaHomeWork.hw_10_Exception;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
