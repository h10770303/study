package com.test.desindemo.factory.inteface.impl;

import com.test.desindemo.factory.inteface.Sender;

public class CMSSender implements Sender {

	@Override
	public void send() {
		System.out.println("通过CMS发邮件！");

	}

}
