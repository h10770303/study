package fileaddremove;

import java.io.File;
import java.io.IOException;

public class FileAddRemove {
	
	/**
	 * 该功能是删除 空文件夹
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\testhh");
		File file2=new File("D:\\test\\11.txt");
		if(!file.exists()){
			// 创建文件夹
			file.mkdirs();
		}
		// 创建文件
//		file2.createNewFile();
//		// 删除文件
//		file2.delete();
		
		FileAddRemove.dealFile(file);
		
	
	}
	
	/**
	 * 循环扫描文件进行处理
	 */
	public static void dealFile(File file){
		
		System.out.println("根目录"+file+",是否为文件夹"+file.isDirectory());
		File[] files=file.listFiles();
		System.out.println("文件子目录个数："+files.length);
		if (files.length>0) {
			// 当有子目录
			for (File fileChild : files) {
				System.out.println("子目录："+fileChild);
				if(fileChild.isDirectory()){
					//重复操作
					System.out.println("子目录为目录，继续循环操作：");
					FileAddRemove.dealFile(fileChild);
				}else if (fileChild.isFile()) {
					// 删除文件
//					System.out.println("子目录问文件，直接删除："+fileChild);
//					fileChild.delete();
				}
			}
		} else {
			// 没有子目录子直接删除
			System.out.println("没有子目录，直接删除文件夹目录");
			file.delete();
		}
	}
	
	

}
