package com.test.desindemo.trategy.abstractclass;

import com.test.desindemo.trategy.inteface.FlyBehavior;
import com.test.desindemo.trategy.inteface.QuackBehaior;

/**
 * 通过策略模式 在抽象类中实现 对极易变化方法的实现，同时抽象出各子类功能的属性 或者方法
 * @author Administrator
 *
 */
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehaior quackBehaior;

	public Duck() {
	}

	/**
	 * 所有的鸭子都会游泳
	 * 
	 * @param string
	 */
	public void swim(String string) {
		System.out.println(string + "can swiming !");
	}

	/**
	 * 鸭子都有颜色 但颜色不一样 所有父类中进行抽象
	 */
	public abstract void display();
	
	/**
	 * 父类增加飞的功能
	 */
	public void fly(){
		flyBehavior.fly();
	}
	
	/**
	 * 父类增加叫的功能 但叫有很多种情况
	 */
	public void duack(){
		quackBehaior.duack();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehaior getQuackBehaior() {
		return quackBehaior;
	}

	public void setQuackBehaior(QuackBehaior quackBehaior) {
		this.quackBehaior = quackBehaior;
	}


}
