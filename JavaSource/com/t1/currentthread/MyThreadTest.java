package com.t1.currentthread;

/**
 * �ֱ�ִ��start()��run()��������MyThread��run������ִ���̷ֱ߳���Thread-0��main
 * ���췽��ִ�еĶ���main�߳�
 * @author Administrator
 * @date 2017-10-24
 */
public class MyThreadTest {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		//myThread.start();
		myThread.run();
	}
	
}
