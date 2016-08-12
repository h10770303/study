package com.test.stringe.base64;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import sun.misc.*;  
/**
 * base64加密 解密过程
 * @author hh
 *
 */
public class Base64Test {

	
	/**
	 * 加密
	 */
	public static  String getBase64(String str){
		 byte[] b = null;  
	        String s = null;  
	        try {  
	            b = str.getBytes("utf-8");  
	        } catch (UnsupportedEncodingException e) {  
	            e.printStackTrace();  
	        }  
	        if (b != null) {  
//	            s = new BASE64Encoder().encode(b);  
	        }  
	        return s;  
		
	}
	
	/**
	 * 解密
	 */
	public static String getFromBase64(String s){
		String str="";
		try {
			byte[] b = null;
//			BASE64Decoder base64Decoder = new BASE64Decoder();
//			b=base64Decoder.decodeBuffer(s);
			str=new String(b, "utf-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
}
