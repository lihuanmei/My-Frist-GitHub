package cn.itcast_01;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.SynchronousQueue;

public class FileDemo_02 {
	public static void main(String[] args) {
		File file=new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.getPath());
		System.out.println(file.lastModified());
		
	}

}
