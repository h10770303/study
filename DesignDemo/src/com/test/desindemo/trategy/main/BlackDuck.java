package com.test.desindemo.trategy.main;

import com.test.desindemo.trategy.abstractclass.Duck;
import com.test.desindemo.trategy.inteface.impl.FlyUable;
import com.test.desindemo.trategy.inteface.impl.QuackWithZaza;
import com.test.desindemo.trategy.inteface.impl.QuackZizi;

public class BlackDuck extends Duck {

	public BlackDuck() {
		flyBehavior = new FlyUable();//将易变化的在父类中定义为属性
		quackBehaior = new QuackZizi();

	}

	@Override
	public void display() {
		System.out.println("该是黑色的鸭子！");

	}
	
	public static void main(String[] args) {
		BlackDuck blackDuck=new BlackDuck();
		blackDuck.swim("blackDuck ");
		blackDuck.display();
		blackDuck.fly();
		blackDuck.duack();
	}

}
