package com.test.desindemo.factory.inteface.impl;

import com.test.desindemo.factory.inteface.Sender;

public class MailSender implements Sender {

	@Override
	public void send() {
		System.out.println(" 通过QQ邮箱发邮件！");

	}

}
