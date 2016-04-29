package com.bazlur.java.io;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {
	public static void main(String[] args) throws IOException {
		File dir = new File("/home/rokonoid/myDir");

		dir.mkdir();

		String dirPath = dir.getPath();
		System.out.println("Diectory Path: " + dirPath);

		// lets create a new file
		String fileName = "hello.txt";
		File file = new File(dirPath + File.separator + fileName);
		file.createNewFile();
		
		String filePath = file.getPath();
		System.out.println("File Path: "+ filePath);
	}
}
