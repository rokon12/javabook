package com.bazlur.java.controlflow;

public class Example {
	public static void main(String[] args) {
		int x = 10;

		if (x < 20) {
			System.out.print("This is if statement");
		}

		if (x < 20) {
			System.out.print("This is if statement");
		} else {
			System.out.print("This is else statement");
		}

		int score = 76;
		char grade;

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Grade = " + grade);
	}
}
