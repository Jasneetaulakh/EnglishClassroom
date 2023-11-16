package com.jasneet;

import com.jasneet.exceptions.InvalidTextException;
import com.jasneet.textConverters.Converter;

public class Main {

    public static void main(String[] args) {
        Converter converter = new Converter();
        String translatedText;
        if(args.length > 1) {
            try{
                boolean isMorse = Boolean.parseBoolean(args[0]);
                if(isMorse) {
                    translatedText = String.format("Morse: %s as Text: %s", args[1], converter.converter(isMorse, args[1]));
                } else {
                    translatedText = String.format("Text: %s in Morse: %s", args[1], converter.converter(isMorse, args[1]));
                }
            } catch (InvalidTextException e) {
                translatedText = String.format("Invalid text entered. Further details: %s", e.getMessage());
            }
        } else {
            translatedText = "No text entered to convert.";
        }
        System.out.println(translatedText);
    }
}
