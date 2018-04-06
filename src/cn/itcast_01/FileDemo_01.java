package cn.itcast_01;

import java.io.File;
import java.io.IOException;

public class FileDemo_01 {
	public static void main(String[] args) {
		File file=new File("E:\\4.JPG");
		File newFile=new File("E:\\√¿≈Æ.jpg");
		System.out.println(file.renameTo(newFile));
		
		File f=new File("E:\\1.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		System.out.println(f.canWrite());
		System.out.println(f.canRead());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
		
	}

}
