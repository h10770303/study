package com.test.desindemo.factory.abstractfactory;

import com.test.desindemo.factory.inteface.Sender;

public class Main {

	/**
	 *  通过抽象工厂接口获取具体是哪个工程，
	 *  通过工厂方法获取具体是邮件发送方
	 *  获取信息
	 * @param args
	 */
	public static void main(String[] args) {
		Factory factory=new MailFactory();
		Sender sender=factory.sender();
		sender.send();
		
		Factory factory2=new CMSFactory();
		Sender sender2=factory2.sender();
		sender2.send();
		
	}
}
