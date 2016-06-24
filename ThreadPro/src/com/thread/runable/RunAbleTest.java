package com.thread.runable;

/**
 * 使用runable接口实现多线程
 *   需要注意，启动多线程的时候需要使用Thread的构造方法Tread(Runable target) 创建对象 然后在start进行开启线程
 * @author hh
 *
 */
public class RunAbleTest implements Runnable {
	
	private String name;

	@Override
	public void run() {
		System.out.println("调用了线程！！");
		for (int i = 0; i < 10; i++) {
			System.out.println(name+"线程:" + i);
		}
		
		try {
			// 需要注意的是sleep()是Thread类的方法， 在实现runable接口时，调用sleep需要这样
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		RunAbleTest runTest1=new RunAbleTest("C");
		RunAbleTest runTest2=new RunAbleTest("D");
		Thread t1 =new Thread(runTest1);
		Thread t2 = new Thread(runTest2);
		t1.start();
		t2.start();
	}

	
	
	public RunAbleTest() {
	}

	public RunAbleTest(String name) {
		this.name = name;
	}
	
	

}
