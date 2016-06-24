package com.thread.runable;


/**
 * 测试Thread创建多线程
 * @author hh
 *
 */
public class ThreadTest extends Thread {

	
	private int count=10;
	private String name;
	
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+"进行了第"+i+"次调用线程");
		}
		
		try {
			sleep(100);
		} catch (Exception e) {
		}
	}
	
	
	public static void main(String[] args) {
		ThreadTest test1=new ThreadTest("A");
		ThreadTest test2=new ThreadTest("B");
		// 需要注意的事，通过Thread实现的多线程对象不能多次进行start
//		ThreadTest test3=test2;
		test1.start();
		test2.start();
//		test3.start();
	}


	
	public ThreadTest() {
	}


	public ThreadTest(String name) {
		super();
		this.name = name;
	}

	
}
