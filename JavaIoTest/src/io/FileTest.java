package io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		
		createFile();
	}

	private static void createFile() {
		
		File file=new File("E:\\hh.txt");
		try {
			file.createNewFile();
//			file.getTotalSpace();
			System.out.println("����Ŀ¼�̴�С��"+file.getTotalSpace()/(1024*1024*1024.0)+"G");
		
			System.out.println(file.getUsableSpace());
			System.out.println("�ļ�������"+file.getName());
			System.out.println("���ڵĸ�Ŀ¼"+file.getParent());
			
//			file.delete();
			file.mkdir();
			System.out.println("�ļ�������"+file.getName());
			System.out.println("���ڵĸ�Ŀ¼"+file.getParent());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ִ�н�������");
	}

}
