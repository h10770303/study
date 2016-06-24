package com.thread.runable;

/**
 * 线程中join的使用 ， 在线程对象中使用Thread1.join()，只有Thread1至线程结束才可以执行当前线程
 * @author hh
 *
 */
public class JoinTest extends Thread {
	
	private String name;
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name+i+"JoinTest");
			}
			sleep(100);
		} catch (Exception e) {
			
		}
	}

	public JoinTest(String name) {
		super();
		this.name = name;
	}

	public JoinTest() {
		super();
	}

	
	
}
