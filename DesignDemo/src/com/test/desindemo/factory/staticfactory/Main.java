package com.test.desindemo.factory.staticfactory;

import com.test.desindemo.factory.inteface.Sender;

public class Main {

	public static void main(String[] args) {
		/**
		 * 通过工厂 进行统一创建对象
		 */
		Sender sender=SenderFactory.mailSender();
		sender.send();
		sender=SenderFactory.cmsSender();
		sender.send();
		
	}
}
