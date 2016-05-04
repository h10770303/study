package com.test.desindemo.factory.staticfactory;

import com.test.desindemo.factory.inteface.Sender;
import com.test.desindemo.factory.inteface.impl.CMSSender;
import com.test.desindemo.factory.inteface.impl.MailSender;

/**
 * 通过工厂 统一管理 创建对象
 *   创建的对象实现同一个接口
 */
public class SenderFactory {
	
	public static Sender mailSender(){
		return new MailSender();
	}

	public static Sender cmsSender(){
		return new CMSSender();
		
	}
	
	
}
