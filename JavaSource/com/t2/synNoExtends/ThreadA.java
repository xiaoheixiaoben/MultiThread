package com.t2.synNoExtends;

public class ThreadA extends Thread{

	private Sub sub;
	
	public ThreadA(Sub sub) {
		this.sub = sub;
		super.run();
	}
	
	@Override
	public void run() {
		super.run();
		sub.serviceMethod();
	}
	
}
