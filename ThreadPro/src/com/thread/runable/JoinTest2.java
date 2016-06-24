package com.thread.runable;

public class JoinTest2 implements Runnable {

	
	@Override
	public void run() {

		try {
			for (int i = 0; i <10; i++) {
				System.out.println(Thread.currentThread().getName()+i+"执行JoinTest2");
			}
			Thread.sleep(10);
		} catch (Exception e) {
			
		}
	}

}
