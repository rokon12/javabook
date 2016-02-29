package com.bazlur.java.array;

public class BlockDemo {
	public static void main(String[] args) {
		boolean condition = true;
		if (condition) { // এখানে ব্লক -১ এর শুরু
			System.out.println("Condition is true.");
		} // এখানে ব্লক -১ শেষ
		else { // এখানে ব্লক-২ শুরু
			System.out.println("Condition is false.");
		} // এখানে ব্লক-২ শেষ
	}
}
