package com.test.stringe.replace;

public class ReplaceTest {

	
	public static void main(String[] args) {
//		 System.out.println("1234567890abcdef -----> "+"1234567890abcdef".replace("12345", "ABCDE"));
//		  System.out.println("1234567890abcdef -----> "+"1234567890abcdef".replaceAll("12345", "ABCDE"));
//		  System.out.println("(1234567890abcdef -----> 1234567890abcdef)".replace("12345", "ABCDE"));
//		  System.out.println("(1234567890abcdef -----> 1234567890abcdef)".replaceAll("12345", "ABCDE"));
//		  System.out.println("!@#$%^&*()-=Abcd -----> "+"!@#$%^&*()-=Abcd".replace("#$%^&", "OK"));
//		  System.out.println("!@#$%^&*()-=Abcd -----> "+"!@#$%^&*()-=Abcd".replaceAll("#$%^&", "OK"));
		
//		boolean empt=true;
//		for (int i = 0; i < 5; i++) {
//			empt&=true;
//			System.out.println(empt);
//		}
		
		
		
		 String aa="45dfdff";
		 if (-1!=aa.lastIndexOf(".")) {
			System.out.println(aa.substring(aa.lastIndexOf(".")));
		}else{
			System.out.println("文件没有扩展名");
		}
	}
}
