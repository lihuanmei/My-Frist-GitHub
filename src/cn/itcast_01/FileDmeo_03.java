package cn.itcast_01;

import java.io.File;

public class FileDmeo_03 {
	public static void main(String[] args) {
		File file = new File("e:\\");
		// ��ȡָ��Ŀ¼�µ��ļ������ļ��е���������
		String[] strs = file.list();
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
		System.out.println("------");
		File[] f = file.listFiles();
		for (File files : f) {

			if (files.getName().contains(".")) {
				System.out.println(files.getName());
			}
		}

	}

}
