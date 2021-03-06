package com.bazlur.java.datatype;

public class UnaryDemo {
	public static void main(String[] args) {

		int result = +1;
		// এটি এক করে ইনক্রিমেন্ট করে, সুতরাং
		// এখানে result এর মান 1
		System.out.println(result);

		result--;
		// এটি এক করে ডিক্রিমেন্ট করে,
		// সুতরাং এখানে result এর মান 0
		System.out.println(result);

		result++;
		// এটিও এক করে ইনক্রিমেন্ট করে,
		// সুতরাং এখানে result এর মান আবার ১
		System.out.println(result);

		result = -result;
		// এখানে result কে নেগেট করে,
		// সুতরাং এর মান এখন -1
		System.out.println(result);

		boolean success = false;
		// এখানে বুলিয়ানের মান হচ্ছে false
		System.out.println(success);
		// কিন্তু এর আগে একটি নেগেট অপারেটর
		// এড করলে এটি হয়ে যায়
		System.out.println(!success);
	}
}
