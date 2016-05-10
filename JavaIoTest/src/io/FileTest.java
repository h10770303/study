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
			System.out.println("所在目录盘大小："+file.getTotalSpace()/(1024*1024*1024.0)+"G");
		
			System.out.println(file.getUsableSpace());
			System.out.println("文件的名字"+file.getName());
			System.out.println("所在的父目录"+file.getParent());
			
//			file.delete();
			file.mkdir();
			System.out.println("文件的名字"+file.getName());
			System.out.println("所在的父目录"+file.getParent());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("执行结束！！");
	}

}
