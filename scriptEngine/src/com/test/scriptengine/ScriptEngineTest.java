package com.test.scriptengine;



import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineTest {
	
	public static void main(String[] args) {
		
		// 1. 创建引擎的管理实例
		ScriptEngineManager manager=new ScriptEngineManager();
		
		//2. 通过工厂获取所有实例的定义
		List<ScriptEngineFactory> factories=manager.getEngineFactories();
		
//		########################################################
//		System.out.println("工厂："+factories.size());
//		for (ScriptEngineFactory factory : factories) {
//			
//			System.out.println("获取引擎的名字："+factory.getEngineName());
//			System.out.println("获取引擎的版本号："+factory.getEngineVersion());
//			System.out.println("获取引擎的默认语言："+factory.getLanguageName());
//			System.out.println("获取引擎的默认语言版本号："+factory.getLanguageVersion());
//			System.out.println("获取引擎的语言扩展名："+factory.getExtensions());
//			System.out.println("获取引擎的语言mine类型："+factory.getMimeTypes());
//			System.out.println("获取引擎的支撑的语言名字："+factory.getNames());
//			
//			 ScriptEngine engine= factory.getScriptEngine();
//			 System.out.println("获取引擎实例："+engine);
//			
//		}
		
		/**
		 * 根据以上，说明可以通过多种方式定义引擎的语言
		 *  根据扩展名Extensions   根据mine名MimeTypes  根据名字Names
		 */
//		ScriptEngine engine=manager.getEngineByExtension("js");
//		ScriptEngine engine=manager.getEngineByMimeType("application/javascript");
		ScriptEngine engine=manager.getEngineByName("javascript");
		
//		String time="console('第一种页面加载方式');";
		String time="var date=new Date(); 	date.getFullYear(); ";
		try {
		System.out.println("执行JavaScript脚本："+engine.eval(time));	
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
