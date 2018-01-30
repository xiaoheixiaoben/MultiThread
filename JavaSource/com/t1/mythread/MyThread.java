package com.t1.mythread;

/**
 * 通过继承Thread来实现多线程
 * @author Administrator
 * @date 2017-10-23
 */
public class MyThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("MyThread");
	}
	
}
