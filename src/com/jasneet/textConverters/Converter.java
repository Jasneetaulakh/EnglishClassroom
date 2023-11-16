package com.jasneet.textConverters;

import com.jasneet.exceptions.InvalidTextException;
import com.jasneet.textConverters.MorseToTextConverter;
import com.jasneet.textConverters.TextToMorseConverter;
import com.jasneet.util.TextValidator;

public class Converter {
    MorseToTextConverter morseToTextConverter = new MorseToTextConverter();
    TextToMorseConverter textToMorseConverter = new TextToMorseConverter();

    public String converter(boolean isMorse, String textToConvert) throws InvalidTextException {
        String convertedText;
        if(!TextValidator.isTextValid(textToConvert)) {
            throw new InvalidTextException();
        } else {
            if(isMorse) {
                convertedText = morseToTextConverter.convertMorseToText(textToConvert);
            } else {
                convertedText = textToMorseConverter.convertTextToMorse(textToConvert);
            }
        }
        return convertedText;
    }
}
