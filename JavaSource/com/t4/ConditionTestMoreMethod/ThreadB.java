package com.t4.ConditionTestMoreMethod;

public class ThreadB extends Thread{

	private MyService myService ;
	
	public ThreadB(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		super.run();
		myService.methodB();
	}
	
}
