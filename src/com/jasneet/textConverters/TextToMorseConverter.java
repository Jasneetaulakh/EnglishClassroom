package com.jasneet.textConverters;

import com.jasneet.exceptions.InvalidTextException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextToMorseConverter {

    private static Map<String, String> textToMorseMap = new HashMap<String, String>();

    static {
        populateTextToMorseMap();
    }

    public String convertTextToMorse(String text) throws InvalidTextException {
        text = text.toLowerCase();
        List<String> morseList = new ArrayList<String>();
        for(int i = 0; i < text.length(); i++) {
            morseList.add(convertLetterToMorseLetter(text.substring(i, i+1)));
        }
        if(morseList.contains(null)) {
            throw new InvalidTextException();
        }
        return convertMorseListToMorseString(morseList);
    }

    private String convertMorseListToMorseString(List list) {
        return list.toString().
                replaceAll("\\[|\\]", "").
                replaceAll(",", "");
    }

    private String convertLetterToMorseLetter(String letter) {
        return textToMorseMap.get(letter);
    }

    public static void populateTextToMorseMap() {
        textToMorseMap.put("a", ".-");
        textToMorseMap.put("b", "-...");
        textToMorseMap.put("c", "-.-.");
        textToMorseMap.put("d", "-..");
        textToMorseMap.put("e", ".");
        textToMorseMap.put("f", "..-.");
        textToMorseMap.put("g", "--.");
        textToMorseMap.put("h", "....");
        textToMorseMap.put("i", "..");
        textToMorseMap.put("j", ".---");
        textToMorseMap.put("k", "-.-");
        textToMorseMap.put("l", ".-..");
        textToMorseMap.put("m", "--");
        textToMorseMap.put("n", "-.");
        textToMorseMap.put("o", "---");
        textToMorseMap.put("p", ".--.");
        textToMorseMap.put("q", "--.-");
        textToMorseMap.put("r", ".-.");
        textToMorseMap.put("s", "...");
        textToMorseMap.put("t", "-");
        textToMorseMap.put("u", "..-");
        textToMorseMap.put("v", "...-");
        textToMorseMap.put("w", ".--");
        textToMorseMap.put("x", "-..-");
        textToMorseMap.put("y", "-.--");
        textToMorseMap.put("z", "--..");
        textToMorseMap.put(".", ".-.-.-");
        textToMorseMap.put(" ", " ");
        textToMorseMap.put("  ", "      ");
    }
}
