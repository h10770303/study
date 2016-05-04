package com.test.desindemo.factory.staticfactory;

import com.test.desindemo.factory.inteface.Sender;
import com.test.desindemo.factory.inteface.impl.CMSSender;
import com.test.desindemo.factory.inteface.impl.MailSender;

/**
 * ͨ������ ͳһ���� ��������
 *   �����Ķ���ʵ��ͬһ���ӿ�
 */
public class SenderFactory {
	
	public static Sender mailSender(){
		return new MailSender();
	}

	public static Sender cmsSender(){
		return new CMSSender();
		
	}
	
	
}
