package com.t1.mythread;

public class MyRunnableTest {
	
	public static void main(String[] args) {
		Runnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("ÔËĞĞ½áÊø");
	}
	
}
