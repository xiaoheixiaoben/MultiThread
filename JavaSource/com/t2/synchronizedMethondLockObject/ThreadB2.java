package com.t2.synchronizedMethondLockObject;

public class ThreadB2 extends Thread{
	
	private MyObject2 myObject2;
	
	public ThreadB2(MyObject2 myObject2) {
		this.myObject2 = myObject2;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myObject2.methodB();
	}
}
