package com.bazlur.java.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingPrimitivesExample {
	public static void main(String[] args) {
		String destFileName = "primitivs.data";
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(destFileName));
			dos.writeInt(152);
			dos.writeDouble(4.56);
			dos.writeBoolean(true);
			dos.writeLong(Long.MAX_VALUE);
			
			dos.flush();
			dos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
