package com.t1.mythread;

/**
 * 
 * @author Administrator
 * @date 2017-10-23
 */
public class ThreadRandom extends Thread{

	private int i ;
	
	public ThreadRandom(int i) {
		super();
		this.i = i;
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println(i);
	}
}
