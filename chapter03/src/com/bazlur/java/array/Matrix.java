package com.bazlur.java.array;

import java.util.Random;

public class Matrix {
	Random random = new Random();

	// return a random m-by-n matrix with values between 0 and 1
	public int[][] random(int m, int n) {
		int[][] c = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				c[i][j] = random.nextInt(100);
		;
		return c;
	}

	// return c = a * b
	public int[][] multiply(int[][] a, int[][] b) {
		int mA = a.length;
		int nA = a[0].length;
		int mB = b.length;
		int nB = b[0].length;
		if (nA != mB)
			throw new RuntimeException("Illegal matrix dimensions.");

		int[][] c = new int[mA][nB];
		for (int i = 0; i < mA; i++)
			for (int j = 0; j < nB; j++)
				for (int k = 0; k < nA; k++)
					c[i][j] += a[i][k] * b[k][j];
		return c;
	}

	// return c = a + b
	public int[][] add(int[][] a, int[][] b) {
		int m = a.length;
		int n = a[0].length;
		int[][] c = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				c[i][j] = a[i][j] + b[i][j];
		return c;
	}

	// return c = a - b
	public int[][] subtract(int[][] a, int[][] b) {
		int m = a.length;
		int n = a[0].length;
		int[][] c = new int[m][n];
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
				c[i][j] = a[i][j] - b[i][j];
		return c;
	}

	public void print(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Matrix matrix = new Matrix();

		int[][] a = matrix.random(5, 5);
		int[][] b = matrix.random(5, 5);

		int[][] multiply = matrix.multiply(a, b);
		System.out.println("Result # 1 : ");
		matrix.print(multiply);

		int[][] add = matrix.add(a, b);
		System.out.println("\nResult # 2: ");
		matrix.print(add);

		int[][] subtract = matrix.subtract(a, b);
		System.out.println("\nResult # 3: ");

		matrix.print(subtract);
	}
}
