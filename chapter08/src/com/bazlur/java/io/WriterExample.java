package com.bazlur.java.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) {
		Writer writer;
		String text = "Lorem ipsum dolor sit amet,"
				+ " consectetur adipiscing elit. "
				+ "Suspendisse at placerat ipsum. ";
		
		try {
			writer = new FileWriter("output2.txt");
			writer.write(text);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
