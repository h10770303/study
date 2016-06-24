package com.thread.runable;

/**
 * JoinTest的测试类  join 是有写问题的
 * @author hh
 *
 */
public class JoinMain {

	public static void main(String[] args) {
		JoinTest joinTest=new JoinTest();
		JoinTest joinTest3=new JoinTest("joinTest3:");
		JoinTest joinTest4=new JoinTest("joinTest4:");
		JoinTest2 joinTest2=new JoinTest2();
//		joinTest.start();
		joinTest3.start();
		joinTest4.start();
//		new Thread(joinTest2).start();
		
		try {
			joinTest3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			joinTest4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
