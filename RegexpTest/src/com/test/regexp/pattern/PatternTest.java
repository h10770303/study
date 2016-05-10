package com.test.regexp.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	
	public static void main(String[] args) {
		String str="ah45454mw";
		str=" a45df ";
		 // 按指定模式在字符串查找
		 str = "This order was placed for QT3000! OK?";
		String spattern = "(.*)(\\d+)(.*)";
//		Pattern pattern=Pattern.compile("[a-z]"); //模式构造器
		Pattern pattern=Pattern.compile(spattern); //模式构造器
		Matcher matcher=pattern.matcher(str); //匹配构造器
		
		//1. //[a-z]  字符串只有一个字符时true 其他为false
//		boolean isMatch=matcher.matches();// 全文匹配
//		System.out.println("是否全部匹配："+isMatch); 
		
		//2. 匹配的字符串在最开始 为true
//		boolean isMatch=matcher.lookingAt();
//		System.out.println("是否最开始匹配："+isMatch);
//		
		// 3. 只要匹配到就为true
//		boolean isMatch=matcher.find();
//		System.out.println("是否匹配到字符串："+isMatch);
		
		
		//4 将第一次匹配到子字符串替换
//		String fristRepl=matcher.replaceFirst("**");
//		System.out.println("第一次匹配到的替换："+fristRepl);
//		
//		//5.全文匹配到的全部替换
//		String replace=matcher.replaceAll("**");
//		System.out.println("全文匹配到的全部替换："+replace);
		
		// 6. 将匹配的结果插入某个字符串之后？？？？
//		StringBuffer sb=new StringBuffer("带插入的字符串");
//		// 先判断是否有匹配的
//		if (matcher.find()) {
//			matcher.appendReplacement(sb, "&");
//			System.out.println(str);
//			System.out.println("最终将匹配的字符串插入到："+sb.toString());
//		} else {
//
//			System.out.println("没有匹配的");
//		}

		
		// group  针对正则表达式中含有()的 ，改为组的概念。 可以通过0,1,2..对某个组内的正则表示式单独的处理，0，代表全部
//		if(matcher.find()){
//			System.out.println("sdsd");
//			String bb=matcher.group(1);
//			System.out.println(bb);
//		}
		
//		 if (matcher.find( )) {
//			 System.out.println("Found value: " + matcher.group() );
//	         System.out.println("Found value: " + matcher.group(0) );
//	         System.out.println("Found value: " + matcher.group(1) );
//	         System.out.println("Found value: " +matcher.group(2) );
//	      } else {
//	         System.out.println("NO MATCH");
//	      }
//		int count=matcher.groupCount();
//		System.out.println("匹配到几个："+count);
		
		
		
	}
	
	
	

}
