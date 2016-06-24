package filetest;

import java.io.File;

/**
 * file文件名重命名 renameto
 * @author hh
 *
 */
public class ReNameTest {
	
	public static void main(String[] args) {
		String pathname="D:/KANKAN/hh.txt";
		File file=new File(pathname);
		System.out.println(file.renameTo(file));
	}
	
	
	
	
	
	/**
	 * 文件重名为 hh.txt-copy1
	 * @param args
	 */
//	public static void main(String[] args) {
//		String path="D:/KANKAN/hh.txt";
//		File file=new File(path);
//		
//		int count=1;
//		File renamedFile=new File(path+"-copy"+(count++));
//		boolean renamed=file.renameTo(renamedFile);
//		System.out.println(renamed);
//	}
	
	

}
