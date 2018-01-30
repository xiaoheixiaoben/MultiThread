package com.t1.isalive;

/**
 * 判断当前线程是否处于活动状态
 * @author Administrator
 * @date 2017-10-24
 */
public class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("run="+this.isAlive());
	}
}
