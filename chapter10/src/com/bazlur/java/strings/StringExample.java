package com.bazlur.java.strings;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class StringExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] data = new byte[] { (byte) 97, (byte) 98, (byte) 99 };
		String abc = new String(data, "UTF-8");
		System.out.println(abc);

		Date date = new Date();
		String string = date.toString();
		System.out.println(string);

		String one = String.valueOf(1);
		System.out.println(one);
		String two = String.valueOf(2.384f);
		System.out.println(two);
		String notTrue = String.valueOf(false);
		System.out.println(notTrue);

		System.out.println(1 + 2);
		System.out.println("a" + "b");
		System.out.println("a" + "b" + 3);
		System.out.println(1 + 2 + "c");

		int three = 3;
		String four = "4";
		System.out.println(1 + 2 + three + four);

		String str1 = "Hello world!";
		String hello = str1.substring(0, 5);
		System.out.println(hello);
		System.out.println(str1.length());

		System.out.println(str1.substring(4, 4));
		// System.out.println(str1.substring(4, 2));
		// System.out.println(str1.substring(3, 18));

		String country = "Bangladesh";
		System.out.println(country.indexOf('a'));
		System.out.println(country.indexOf("ng"));
		System.out.println(country.indexOf('a', 4));
		System.out.println(country.indexOf("ds", 5));

		System.out.println("abc".equals("ABC")); // false
		System.out.println("ABC".equals("ABC")); // true
		System.out.println("abc".equalsIgnoreCase("ABC")); // true

		String name = "Bazlur Rahman Rokon";
		System.out.println(name.contains("Rahman")); // true

		System.out.println(name.startsWith("Bazlur"));
		System.out.println(name.endsWith("Rokon"));

		String line = "Lorem ipsum dolor sit amet.";
		System.out.println(line.replace('o', 'X'));
		System.out.println(line.replace("dolor", "hello"));

		String helloWorld = "         hello world          ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.length());
		System.out.println(helloWorld.trim());
		System.out.println(helloWorld.trim().length());
		
		System.out.println("         hello world          ".trim()); // abc
	}

}
