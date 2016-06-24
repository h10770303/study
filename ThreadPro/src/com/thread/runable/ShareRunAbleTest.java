package com.thread.runable;

import javax.swing.plaf.SliderUI;

/**
 *  测试通过runable实现共享资源
 * @author hh
 *
 */
public class ShareRunAbleTest implements Runnable {

	private int count=20;
	
	@Override
	public void run() {

		try {
			for (int i = 0; i < 20; i++) {
				System.out.println(Thread.currentThread().getName()+count--);
			}
			Thread.sleep(100);
		} catch (Exception e) {
		}
		
	}
	
	/**
	 * 使用同一对象进行start 对于Thread 是不行的，但是对于runable是可以的
	 * @param args
	 */
	public static void main(String[] args) {
		ShareRunAbleTest share=new ShareRunAbleTest();
		new Thread(share, "A").start();
		new Thread(share, "B").start();
		new Thread(share, "C").start();
	}

}
