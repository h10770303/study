package com.test.regexp.test;

public class Test {

	public static void main(String[] args) {
		String saveAs = "ftp://toavid:toavid@10.27.124.13:2121/video/全媒报片.报片/【海南站0420文稿】海南：一季度GDP同比增长9.7% 增速位居全国第四-(4月20日.xml";
		String path = saveAs.replaceAll("(?i)ftp\\:\\/\\/[^\\/]*", "");
		System.out.println("path=="+path);
	}

}
