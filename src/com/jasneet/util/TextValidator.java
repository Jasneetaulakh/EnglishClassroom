package com.jasneet.util;

import java.util.ArrayList;
import java.util.List;

public class TextValidator {

    public static boolean isTextValid(String text) {
        boolean isValid = true;
        if(text.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }

}
