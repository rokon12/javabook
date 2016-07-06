package com.bazlur.java.nio;

import java.nio.CharBuffer;
import java.util.Random;

public class CharBufferReadWrite {
	public static final Random RANDOM = new Random();

	public static void main(String[] args) {
		CharBuffer cb = CharBuffer.allocate(8);
		System.out.println("Right After Creation : ");
		printBuffer(cb);

		for (int i = 65; i < 73; i++) {
			cb.put((char) i);
		}
		System.out.println("After populating Data: ");
		printBuffer(cb);
	}

	public static void printBuffer(CharBuffer cb) {
		int limit = cb.limit();
		System.out.println("Position: " + cb.position() + ", " + "limit: " + limit);
		System.out.print("Data: ");
		for (int i = 0; i < limit; i++) {
			System.out.print(cb.get(i) + " ");
		}
		System.out.println();
	}
}
