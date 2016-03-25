package com.bazlur.java.array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] a = { -45, 1, 8, 4, 5, 4, 5, 105 };

		System.out.println("Index\tValue");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i + "\t" + a[i]);
		}
	}
}
