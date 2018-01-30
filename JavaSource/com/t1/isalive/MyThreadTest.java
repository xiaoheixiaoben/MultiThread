package com.t1.isalive;

public class MyThreadTest {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		System.out.println("begin="+myThread.isAlive());
		myThread.start();
		myThread.sleep(1000);
		System.out.println("end="+myThread.isAlive());
	}
	
}
