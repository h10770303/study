package com.test.desindemo.trategy.main;

import com.test.desindemo.trategy.abstractclass.Duck;
import com.test.desindemo.trategy.inteface.impl.FlyAble;
import com.test.desindemo.trategy.inteface.impl.QuackWithZaza;

/**
 * 红鸭子 的定义
 * @author Administrator
 *
 */
public class RedDuck extends Duck {

	
	/**
	 * 初始化红色鸭子的飞行能力和叫的声音
	 */
	public RedDuck() {
		flyBehavior=new FlyAble();
		quackBehaior=new QuackWithZaza();
	}
	
	

	@Override
	public void display() {
		 System.out.println("该是红色的鸭子！");
	}
	
	
	public static void main(String[] args) {
		RedDuck redDuck=new RedDuck();
		redDuck.display();// 抽象出都拥有的属性
		redDuck.swim("redDuck ");// 抽象出都拥有的方法
		redDuck.fly();// 容易变化的方法  通过接口实现
		redDuck.duack();// 容易变化的方法 通过接口实现
		
	}

}
