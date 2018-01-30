package com.t2.synNoExtends;

public class ThreadB extends Thread{

	private Sub sub;
	
	public ThreadB(Sub sub) {
		this.sub = sub;
		super.run();
	}
	
	@Override
	public void run() {
		super.run();
		sub.serviceMethod();
	}
	
}
