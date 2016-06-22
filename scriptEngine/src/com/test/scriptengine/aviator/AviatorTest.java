package com.test.scriptengine.aviator;

import java.util.HashMap;
import java.util.Map;

import com.googlecode.aviator.AviatorEvaluator;

public class AviatorTest {
	
	public static void main(String[] args) {
		
		// 1. 支持运算
//		System.out.println("使用aviator表达式："+AviatorEvaluator.execute("'1'+'2'+'3'"));
		
		// 2. 支持表达式
		System.out.println(AviatorEvaluator.execute("3>=2 && 1!=4 && true"));
		
		// 3. 支持变量  变量必须和map 结合使用
		// 4. aviator使用字符串 必须在""中使用''
		String userName="胡明伟";
		Map<String, Object> env=new HashMap<>();
		env.put("key", userName);
		System.out.println(AviatorEvaluator.execute("'hello'+key", env));
		
		//5. 3元表达式
		System.out.println("三元表达式："+AviatorEvaluator.execute("3>2?'yes':'no'"));
		
		
	}

}
