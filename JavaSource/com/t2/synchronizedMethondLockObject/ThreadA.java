package com.t2.synchronizedMethondLockObject;

public class ThreadA extends Thread{
	
	private MyObject1 myObject1;
	
	public ThreadA(MyObject1 myObject1) {
		this.myObject1 = myObject1;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myObject1.methodA();
	}
}
