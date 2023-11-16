package com.jasneet.tests;

import com.jasneet.exceptions.InvalidTextException;
import com.jasneet.textConverters.Converter;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTests {
    Converter converter = new Converter();

    @Test
    public void testMorseToText() throws InvalidTextException {
        Assert.assertEquals("hello", converter.converter(true, ".... . .-.. .-.. ---"));
    }

    @Test
    public void testTextToMorse() throws InvalidTextException {
        Assert.assertEquals(".... ..   - .... . .-. .", converter.converter(false, "hi there"));
    }

    @Test
    public void testCapitalisedText() throws InvalidTextException {
        Assert.assertEquals(".... . .-.. .-.. ---   -- .- - .", converter.converter(false, "HELLO mATE"));
    }

    @Test
    public void testFullStopInText() throws InvalidTextException {
        Assert.assertEquals(".... . .-.. .-.. --- .-.-.-   .... --- .--   .- .-. .   -.-- --- ..-", converter.converter(false, "hello. how are you"));
    }

    @Test(expected = InvalidTextException.class)
    public void testEmptyMorseText() throws InvalidTextException {
        converter.converter(true, "");
    }

    @Test(expected = InvalidTextException.class)
    public void testEmptyTextThrowsException() throws InvalidTextException {
        converter.converter(false, "");
    }

    @Test(expected = InvalidTextException.class)
    public void testNumbersInMorseTextThrowsException() throws InvalidTextException {
        converter.converter(true, ".... . .-.. .-.. 8---   -- .- - .");
    }

    @Test(expected = InvalidTextException.class)
    public void testNumbersInTextThrowsException() throws InvalidTextException {
        converter.converter(false, "he990");
    }

    @Test(expected = InvalidTextException.class)
    public void testPunctuationInTextThrowsException() throws InvalidTextException {
        converter.converter(false, "what?");
    }

    @Test(expected = InvalidTextException.class)
    public void testPunctuationInMorseTextThrowsException() throws InvalidTextException {
        converter.converter(true, "?");
    }
    @Test(expected = InvalidTextException.class)
    public void testEnglishTextWhenMorseExpectedThrowsExcpetion() throws InvalidTextException {
        converter.converter(true, "hey");
    }

    @Test(expected = InvalidTextException.class)
    public void testMorseTextWhenEnglishTextExpectedThrowsException() throws InvalidTextException {
        converter.converter(false, ".-");
    }
}

