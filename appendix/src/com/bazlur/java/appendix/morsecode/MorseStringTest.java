package com.bazlur.java.appendix.morsecode;

import javax.sound.sampled.LineUnavailableException;

/**
 * @author Bazlur Rahman Rokon
 * @since 6/24/16.
 */
public class MorseStringTest {
   public static void main(String[] args) {
       MorseCodeTranslator translator = new MorseCodeTranslator();
       MorseString helloWorld = translator.toMorseString("Hello world");
       System.out.println(helloWorld);
       try {
		helloWorld.play();
	} catch (LineUnavailableException e) {
		e.printStackTrace();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

       String text = translator.toText(".. / .-.. --- ...- . / .--- .- ...- .-");
       System.out.println(text);
   }
}
