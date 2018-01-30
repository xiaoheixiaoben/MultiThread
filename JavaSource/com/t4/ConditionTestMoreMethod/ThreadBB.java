package com.t4.ConditionTestMoreMethod;

public class ThreadBB extends Thread{

	private MyService myService ;
	
	public ThreadBB(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		super.run();
		myService.methodB();
	}
	
}
