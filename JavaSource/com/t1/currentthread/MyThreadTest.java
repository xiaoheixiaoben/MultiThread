package com.t1.currentthread;

/**
 * 分别执行start()和run()方法，在MyThread中run方法的执行线程分别是Thread-0和main
 * 构造方法执行的都是main线程
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
