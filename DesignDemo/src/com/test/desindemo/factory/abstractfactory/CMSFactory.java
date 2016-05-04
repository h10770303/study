package com.test.desindemo.factory.abstractfactory;

import com.test.desindemo.factory.inteface.Sender;
import com.test.desindemo.factory.inteface.impl.CMSSender;


public class CMSFactory implements Factory {

	public Sender sender() {
		return new CMSSender();
	}

}
