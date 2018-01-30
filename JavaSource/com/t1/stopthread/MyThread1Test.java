package com.t1.stopthread;

public class MyThread1Test {

	public static void main(String[] args) {
		try {
			MyThread1 myThread1 = new MyThread1();
			myThread1.start();
			Thread.sleep(1000);
			myThread1.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end!");
	}
	
}
