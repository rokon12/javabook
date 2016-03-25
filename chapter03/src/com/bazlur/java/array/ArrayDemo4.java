package com.bazlur.java.array;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int array[][] = new int[12][8]; // a 12×8 grid of int
		array[0][0] = 8;
		array[1][1] = 5;
		
		System.out.println(array.length); // 12
		System.out.println(array[0].length); // 8
		System.out.println(array[11].length);
	}
}
