package com.t4.Reentrantlocktest;

public class MyThread extends Thread{

	private MyService myService;
		
	public MyThread(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		super.run();
		myService.testMethod();
	}
	
}
