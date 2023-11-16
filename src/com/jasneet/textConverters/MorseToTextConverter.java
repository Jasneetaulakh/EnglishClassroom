package com.jasneet.textConverters;

import com.jasneet.exceptions.InvalidTextException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MorseToTextConverter {

    private static Map<String, String> morseToTextMap = new HashMap<String, String>();

    static {
        populateMorseToTextMap();
    }

    public String convertMorseToText(String morseText) throws InvalidTextException {
        String[] morseTextArray = morseText.split(" ");
        List<String> textList = new ArrayList<String>();
        for (String s : morseTextArray) {
            textList.add(convertMorseLetterToTextLetter(s));
        }
        if(textList.contains(null)) {
            throw new InvalidTextException();
        }
        return convertTextListToTextString(textList);
    }

    private String convertTextListToTextString(List list) {
        return list.toString().
                replaceAll("\\[|\\]", "").
                replaceAll(", ", "").
                replaceAll("  ", " ");
    }

    private String convertMorseLetterToTextLetter(String morseLetter) {
        return morseToTextMap.get(morseLetter);
    }


    public static void populateMorseToTextMap() {
        morseToTextMap.put(".-", "a");
        morseToTextMap.put("-...", "b");
        morseToTextMap.put("-.-.", "c");
        morseToTextMap.put("-..", "d");
        morseToTextMap.put(".", "e");
        morseToTextMap.put("..-.", "f");
        morseToTextMap.put("--.", "g");
        morseToTextMap.put("....", "h");
        morseToTextMap.put("..", "i");
        morseToTextMap.put(".---", "j");
        morseToTextMap.put("-.-", "k");
        morseToTextMap.put(".-..", "l");
        morseToTextMap.put("--", "m");
        morseToTextMap.put("-.", "n");
        morseToTextMap.put("---", "o");
        morseToTextMap.put(".--.", "p");
        morseToTextMap.put("--.-", "q");
        morseToTextMap.put(".-.", "r");
        morseToTextMap.put("...", "s");
        morseToTextMap.put("-", "t");
        morseToTextMap.put("..-", "u");
        morseToTextMap.put("...-", "v");
        morseToTextMap.put(".--", "w");
        morseToTextMap.put("-..-", "x");
        morseToTextMap.put("-.--", "y");
        morseToTextMap.put("--..", "z");
        morseToTextMap.put("", " ");
        morseToTextMap.put(".-.-.-", ".");
    }
}
