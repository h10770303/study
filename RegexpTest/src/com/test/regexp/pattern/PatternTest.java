package com.test.regexp.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
	
	public static void main(String[] args) {
		String str="ah45454mw";
		str=" a45df ";
		 // ��ָ��ģʽ���ַ�������
		String line = "This order was placed for QT3000! OK?";
		String spattern = "(.*)(\\d+)(.*)";
//		Pattern pattern=Pattern.compile("[a-z]"); //ģʽ������
		Pattern pattern=Pattern.compile(spattern); //ģʽ������
		Matcher matcher=pattern.matcher(str); //ƥ�乹����
		
		//1. //[a-z]  �ַ���ֻ��һ���ַ�ʱtrue ����Ϊfalse
//		boolean isMatch=matcher.matches();// ȫ��ƥ��
//		System.out.println("�Ƿ�ȫ��ƥ�䣺"+isMatch); 
		
		//2. ƥ����ַ������ʼ Ϊtrue
//		boolean isMatch=matcher.lookingAt();
//		System.out.println("�Ƿ��ʼƥ�䣺"+isMatch);
//		
		// 3. ֻҪƥ�䵽��Ϊtrue
//		boolean isMatch=matcher.find();
//		System.out.println("�Ƿ�ƥ�䵽�ַ�����"+isMatch);
		
		
		//4 ����һ��ƥ�䵽���ַ����滻
//		String fristRepl=matcher.replaceFirst("**");
//		System.out.println("��һ��ƥ�䵽���滻��"+fristRepl);
//		
//		//5.ȫ��ƥ�䵽��ȫ���滻
//		String replace=matcher.replaceAll("**");
//		System.out.println("ȫ��ƥ�䵽��ȫ���滻��"+replace);
		
		// 6. ��ƥ��Ľ������ĳ���ַ���֮�󣿣�����
//		StringBuffer sb=new StringBuffer("��������ַ���");
//		matcher.appendReplacement(sb, "&");
//		System.out.println("���ս�ƥ����ַ������뵽��"+sb.toString());

		
		// group  ??????
//		if(matcher.find()){
//			System.out.println("sdsd");
//			String bb=matcher.group(1);
//			System.out.println(bb);
//		}
		
		 if (matcher.find( )) {
			 System.out.println("Found value: " + matcher.group() );
	         System.out.println("Found value: " + matcher.group(0) );
	         System.out.println("Found value: " + matcher.group(1) );
	         System.out.println("Found value: " +matcher.group(2) );
	      } else {
	         System.out.println("NO MATCH");
	      }
//		int count=matcher.groupCount();
//		System.out.println("ƥ�䵽������"+count);
		
		
		
	}
	
	
	

}
