package com.test.desindemo.trategy.abstractclass;

import com.test.desindemo.trategy.inteface.FlyBehavior;
import com.test.desindemo.trategy.inteface.QuackBehaior;

/**
 * ͨ������ģʽ �ڳ�������ʵ�� �Լ��ױ仯������ʵ�֣�ͬʱ����������๦�ܵ����� ���߷���
 * @author Administrator
 *
 */
public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehaior quackBehaior;

	public Duck() {
	}

	/**
	 * ���е�Ѽ�Ӷ�����Ӿ
	 * 
	 * @param string
	 */
	public void swim(String string) {
		System.out.println(string + "can swiming !");
	}

	/**
	 * Ѽ�Ӷ�����ɫ ����ɫ��һ�� ���и����н��г���
	 */
	public abstract void display();
	
	/**
	 * �������ӷɵĹ���
	 */
	public void fly(){
		flyBehavior.fly();
	}
	
	/**
	 * �������ӽеĹ��� �����кܶ������
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
