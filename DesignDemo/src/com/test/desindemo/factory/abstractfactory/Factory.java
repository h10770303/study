package com.test.desindemo.factory.abstractfactory;

import com.test.desindemo.factory.inteface.Sender;

/**
 * 对多个工厂进行抽象成接口， 通过抽象的接口工厂创建对象
 * @author Administrator
 *
 */
public interface Factory {

	public  Sender sender();
}
