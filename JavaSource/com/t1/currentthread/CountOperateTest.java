package com.t1.currentthread;

/**
 * 
 * @author Administrator
 * @date 2017-10-24
 */
public class CountOperateTest {

	public static void main(String[] args) {
		CountOperate countOperate = new CountOperate();
		/*countOperate.setName("A");
		countOperate.start();*/
		Thread thread = new Thread(countOperate);
		System.out.println("main begin="+thread.isAlive());
		thread.setName("B");
		thread.start();
		System.out.println("main end="+thread.isAlive());
	}
	
}
