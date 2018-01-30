package com.t1.sleep;

/**
 * run方法：只有main线程在执行
 * start方法：main线程与sleepThread两个线程是异步执行的。
 * @author Administrator
 * @date 2017-10-24
 */
public class SleepThreadTest {
	
	public static void main(String[] args) {
		SleepThread sleepThread = new SleepThread();
		System.out.println("begin " + System.currentTimeMillis());
		//sleepThread.run();
		sleepThread.start();
		System.out.println("end " + System.currentTimeMillis());
	}
	
}
