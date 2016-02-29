package com.bazlur.java.array;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] anArray;

		int anotherArray[];

		long[] anArrayOfLongs;
		float[] anArrayOfFloats;
		double[] anArrayOfDoubles;

		// এখানে ১০ সাইজের একটি এরে ক্রিয়েট করা হলো
		anArray = new int[10];

		anArray[0] = 100; // এখানে প্রথম ভ্যাল্যু রাখা হল
		anArray[1] = 200; // এভাবে দ্বিতীয় ভ্যালু
		anArray[2] = 300; // এভাবে বাকি গুলো

		System.out.println("Element 1 at index 0: " + anArray[0]);
		System.out.println("Element 2 at index 1: " + anArray[1]);
		System.out.println("Element 3 at index 2: " + anArray[2]);

		int[] anArray2 = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

		int[][] anArray3 = { { 1, 2, 3 }, { 4, 6, 7 }, { 8, 9 } };
		
		int length = anArray.length; 
	}
}
