package com.bazlur.java.appendix.morsecode;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.util.regex.Pattern;

/**
 * @author Bazlur Rahman Rokon
 * @since 6/24/16.
 * Reference:  http://codereview.stackexchange.com/questions/74794/morse-code-string
 */
public class MorseString {
	private static final String CHAR_SEPARATOR = " ";
	private static final String WORD_SEPARATOR = "/";
	private static final String DOT = ".";
	private static final String DASH = "-";

	private static final float SAMPLE_RATE = 8000;
	private final int ONE_UNIT_OF_MORSE_CODE = 240;

	private static final Pattern VALID_MORSE_PATTERN = Pattern.compile(
			"(" + Pattern.quote(DASH)
					+ "|" + Pattern.quote(DOT)
					+ "|" + Pattern.quote(WORD_SEPARATOR)
					+ "|\\s)*");

	private String text;
	private String codes;

	private static final int DASH_LENGTH = 8;
	private static final int DOT_LENGTH = 3;
	private static final int SPACE_BETWEEN_ONE_LETTER = 1;
	private static final int SPACE_BETWEEN_WORDS = 7;
	private static final int SPACE_BETWEEN_LETTERS = 3;

	public MorseString(String codes) {
		if (!isValidMorse(codes)) {
			throw new IllegalArgumentException(codes
					+ " is not a valid Morse Code");
		}

		this.text = !codes.isEmpty() ? translate(codes) : codes;
		this.codes = codes;
	}

	public static boolean isValidMorse(CharSequence ch) {

		return VALID_MORSE_PATTERN.matcher(ch).matches();
	}

	private String translate(String code) {
		String[] words = code.split(WORD_SEPARATOR);

		StringBuilder result 
				= new StringBuilder();

		for (String word : words) {
			String[] letters = word.trim().split(CHAR_SEPARATOR);
			for (String letter : letters) {
				result.append(MorseCode.decode(letter));
			}
			result.append(CHAR_SEPARATOR);
		}

		String text = result.toString()
				.substring(0, result.length() - 1);

		return text;
	}

	public static MorseString parse(String text) {
		if (text == null || text.isEmpty()) {
			return new MorseString("");
		} else if (!text.matches("[\\s\\dA-Za-z]*")) {
			throw new IllegalArgumentException("String too complicated");
		}

		int length = text.length();
		StringBuilder result 
				= new StringBuilder();

		for (int i = 0; i < length; i++) {
			if (text.charAt(i) == ' ') {
				result.append(WORD_SEPARATOR).append(CHAR_SEPARATOR);
				continue;
			}
			result.append(MorseCode.encode(text.charAt(i)))
					.append(CHAR_SEPARATOR);
		}

		return new MorseString(result.toString().trim());
	}

    /*
		 * Returns the code as a String
     * e.g. if the object represents "hi" in Morse,
     * it returns ".... .."
     */

	@Override
	public String toString() {

		return codes;
	}

	/***
	 * Returns the result of the translations
	 * e.g. if the object represents "hi" in Morse,
	 * it returns "hi"
	 */

	public String asText() {

		return text;
	}

	private void createTone(int hz, int msecs, double vol) throws LineUnavailableException {
		byte[] bufffer = new byte[1];

		AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
		SourceDataLine sourceDataLine = AudioSystem.getSourceDataLine(af);

		sourceDataLine.open(af);
		sourceDataLine.start();
		for (int i = 0; i < msecs * 8; i++) {
			double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
			bufffer[0] = (byte) (Math.sin(angle) * 120.0 * vol);
			sourceDataLine.write(bufffer, 0, 1);
		}
		sourceDataLine.drain();
		sourceDataLine.stop();
		sourceDataLine.close();
	}

	public void play() throws LineUnavailableException, InterruptedException {
		System.out.println("Info: playing morse code : " + codes);
		String[] words = codes.split(WORD_SEPARATOR);

		for (String word : words) {
			playOneWord(word);
		}
	}

	private void playOneWord(String word) throws LineUnavailableException, InterruptedException {
		System.out.println("Info: playing a word: " + word);
		String[] letters = word.split(CHAR_SEPARATOR);

		for (String letter : letters) {
			playOneLetter(letter);
		}
		Thread.sleep(ONE_UNIT_OF_MORSE_CODE * SPACE_BETWEEN_WORDS);
	}

	private void playOneLetter(String letter) throws LineUnavailableException, InterruptedException {
		System.out.println("Info: playing a letter: " + letter);
		char[] chars = letter.trim().toCharArray();

		for (char c : chars) {
			playOneBlip(c);
		}

		Thread.sleep(ONE_UNIT_OF_MORSE_CODE * SPACE_BETWEEN_LETTERS);
	}

	private void playOneBlip(char c) throws LineUnavailableException, InterruptedException {
		System.out.println("Info: playing a blip : " + c);

		if (c == '-') {
			playDash();
		} else if (c == '.') {
			playDot();
		}

		Thread.sleep(ONE_UNIT_OF_MORSE_CODE * SPACE_BETWEEN_ONE_LETTER);
	}

	private void playDot() throws LineUnavailableException {
		createTone(600, ONE_UNIT_OF_MORSE_CODE * DOT_LENGTH, 0.5);
	}

	private void playDash() throws LineUnavailableException {
		createTone(600, ONE_UNIT_OF_MORSE_CODE * DASH_LENGTH, 0.5);
	}
}