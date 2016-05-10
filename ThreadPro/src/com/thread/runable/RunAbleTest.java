package com.thread.runable;

public class RunAbleTest implements Runnable {

	@Override
	public void run() {
		System.out.println("调用了线程！！");
		for (int i = 0; i < 10; i++) {
			System.out.println("线程i" + i);
		}
	}

	public static void main(String[] args) {
		RunAbleTest runTest = new RunAbleTest();
		Thread t1 = new Thread(runTest);
		Thread t2 = new Thread(runTest);
		t1.start();
		t2.start();
	}

}
