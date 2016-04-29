package com.bazlur.java.io;

import java.io.File;
import java.io.FileFilter;

public class FileFileterExample {
	public static void main(String[] args) {
		File home = new File("/home/rokonoid/Pictures");

		FileFilter pngFlter = new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				String fileName = pathname.getName();
				if (fileName.endsWith(".png")) {
					return true;
				}
				return false;
			}
		};

		File[] listRoots = home.listFiles(pngFlter);
		for (File file : listRoots) {
			System.out.println(file.getPath());
		}
	}
}
