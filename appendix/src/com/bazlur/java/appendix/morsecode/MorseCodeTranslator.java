package com.bazlur.java.appendix.morsecode;


/**
 * @author Bazlur Rahman Rokon
 * @since 6/24/16.
 */
public class MorseCodeTranslator {
    public MorseString toMorseString(String text) {

        return MorseString.parse(text);
    }

    public String toText(String morseCode) {
        MorseString morseString = new MorseString(morseCode);

        return morseString.asText();
    }
}
