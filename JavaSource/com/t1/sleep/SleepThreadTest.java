package com.t1.sleep;

/**
 * run������ֻ��main�߳���ִ��
 * start������main�߳���sleepThread�����߳����첽ִ�еġ�
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
