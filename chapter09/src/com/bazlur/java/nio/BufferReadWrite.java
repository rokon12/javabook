package com.bazlur.java.nio;

import java.nio.ByteBuffer;
import java.util.Random;

public class BufferReadWrite {
	public static final Random RANDOM = new Random();

	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.allocate(8);
		System.out.println("Right After Creation : ");
		printBuffer(bb);

		for (int i = 10; i < 18; i++) {
			bb.put((byte) i);
		}
		System.out.println("After populating Data: ");
		printBuffer(bb);
	}

	public static void printBuffer(ByteBuffer bb) {
		int limit = bb.limit();
		System.out.println("Position: " + bb.position() + ", " + "limit: " + limit);
		System.out.print("Data: ");
		for (int i = 0; i < limit; i++) {
			System.out.print(bb.get(i) + " ");
		}
		System.out.println();
	}
}
