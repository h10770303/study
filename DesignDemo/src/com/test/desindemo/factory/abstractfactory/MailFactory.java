package com.test.desindemo.factory.abstractfactory;

import com.test.desindemo.factory.inteface.Sender;
import com.test.desindemo.factory.inteface.impl.MailSender;

/**
 * 分别常见2个工厂，并同时创建两个工程的接口
 * @author Administrator
 *
 */
public class MailFactory implements Factory {

	public Sender sender() {
		return new MailSender();
	}

}
