package com.bazlur.java.io;

import java.io.File;
import java.io.IOException;

public class CurrentWorkingDirectory {
	public static void main(String[] args) throws IOException {
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);

		String newFile = workingDir + File.separator + "hellword.txt";
		File file = new File(newFile);
		
	}
}
