package com.jasneet.exceptions;

public class InvalidTextException extends Exception{

    public InvalidTextException() {};

    public InvalidTextException(String message) {
        super(message);
    }
}
