package com.t1.stopthread;

public class MyThread extends Thread{
    
	private SynchronizedObject object;
    
	public MyThread(SynchronizedObject object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		object.printString("b", "bb");
	}
}
