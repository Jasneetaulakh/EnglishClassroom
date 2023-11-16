package com.jasneet.util;

public class TextValidator {

    public static boolean isTextValid(String text) {
        boolean isValid = true;
        if(text.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }

}
