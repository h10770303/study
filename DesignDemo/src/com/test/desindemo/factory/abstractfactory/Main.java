package com.test.desindemo.factory.abstractfactory;

import com.test.desindemo.factory.inteface.Sender;

public class Main {

	/**
	 *  ͨ�����󹤳��ӿڻ�ȡ�������ĸ����̣�
	 *  ͨ������������ȡ�������ʼ����ͷ�
	 *  ��ȡ��Ϣ
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
