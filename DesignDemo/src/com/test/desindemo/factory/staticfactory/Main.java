package com.test.desindemo.factory.staticfactory;

import com.test.desindemo.factory.inteface.Sender;

public class Main {

	public static void main(String[] args) {
		/**
		 * ͨ������ ����ͳһ��������
		 */
		Sender sender=SenderFactory.mailSender();
		sender.send();
		sender=SenderFactory.cmsSender();
		sender.send();
		
	}
}
