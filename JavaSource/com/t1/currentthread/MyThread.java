package com.t1.currentthread;

/**
 * 
 * @author Administrator
 * @date 2017-10-24
 */
public class MyThread extends Thread{

	public MyThread() {
		System.out.println("构造方法的打印："+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("run方法的打印："+Thread.currentThread().getName());
	}
}
