package com.test.stringe.stringmethod;


public class StringMethod {
	
	public static void main(String[] args) {

		String fn = "两岁女童遭生母情夫残忍虐待 昏迷十个月至今未睁眼-河南科技大学附属医院入院记录以及当时辛怡照片翻拍.jpg";
		String nfn = "测试"
				+ fn.substring(fn.lastIndexOf("."));
		
		System.out.println(nfn);
	}

}
