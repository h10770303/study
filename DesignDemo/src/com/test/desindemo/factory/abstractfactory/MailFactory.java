package com.test.desindemo.factory.abstractfactory;

import com.test.desindemo.factory.inteface.Sender;
import com.test.desindemo.factory.inteface.impl.MailSender;

/**
 * �ֱ𳣼�2����������ͬʱ�����������̵Ľӿ�
 * @author Administrator
 *
 */
public class MailFactory implements Factory {

	public Sender sender() {
		return new MailSender();
	}

}
