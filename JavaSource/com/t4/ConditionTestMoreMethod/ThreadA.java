package com.t4.ConditionTestMoreMethod;

public class ThreadA extends Thread{

	private MyService myService ;
	
	public ThreadA(MyService myService) {
		super();
		this.myService = myService;
	}
	
	@Override
	public void run() {
		super.run();
		myService.methodA();
	}
	
}
