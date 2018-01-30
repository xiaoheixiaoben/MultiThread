package com.t4.ConditionTestMoreMethod;

public class ThreadAA extends Thread{

	private MyService myService ;
	
	public ThreadAA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		super.run();
		myService.methodA();
	}
	
}
