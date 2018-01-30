package com.t2.synchronizedMethondLockObject;

public class ThreadB extends Thread{
	
	private MyObject1 myObject1;
	
	public ThreadB(MyObject1 myObject1) {
		this.myObject1 = myObject1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myObject1.methodB();
	}
}
