package com.test.desindemo.trategy.main;

import com.test.desindemo.trategy.abstractclass.Duck;
import com.test.desindemo.trategy.inteface.impl.FlyAble;
import com.test.desindemo.trategy.inteface.impl.QuackWithZaza;

/**
 * ��Ѽ�� �Ķ���
 * @author Administrator
 *
 */
public class RedDuck extends Duck {

	
	/**
	 * ��ʼ����ɫѼ�ӵķ��������ͽе�����
	 */
	public RedDuck() {
		flyBehavior=new FlyAble();
		quackBehaior=new QuackWithZaza();
	}
	
	

	@Override
	public void display() {
		 System.out.println("���Ǻ�ɫ��Ѽ�ӣ�");
	}
	
	
	public static void main(String[] args) {
		RedDuck redDuck=new RedDuck();
		redDuck.display();// �������ӵ�е�����
		redDuck.swim("redDuck ");// �������ӵ�еķ���
		redDuck.fly();// ���ױ仯�ķ���  ͨ���ӿ�ʵ��
		redDuck.duack();// ���ױ仯�ķ��� ͨ���ӿ�ʵ��
		
	}

}
