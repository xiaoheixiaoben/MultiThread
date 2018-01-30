package com.t4.Reentrantlocktest;

public class RunTest {
	
	public static void main(String[] args) {
		MyService myService = new MyService();
		MyThread myThread = new MyThread(myService);
		MyThread myThread2 = new MyThread(myService);
		MyThread myThread3 = new MyThread(myService);
		MyThread myThread4 = new MyThread(myService);
		MyThread myThread5 = new MyThread(myService);
		myThread.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
	}
	
}
