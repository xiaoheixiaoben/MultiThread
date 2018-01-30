package com.t4.UseConditionWaitNotifyOK;

public class RunTest {

	public static void main(String[] args) throws InterruptedException {
		MyService myService = new MyService();
		MyThread myThread = new MyThread(myService);
		myThread.start();
		Thread.sleep(3000);
		myService.signal();
	}
}
