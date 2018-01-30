package com.t1.mythread;

public class RandomThreadTest {

	public static void main(String[] args) {
		RandomThread randomThread = new RandomThread();
		randomThread.setName("randomThread");
		randomThread.start();
		for (int i = 0; i < 10; i++) {
			int time = (int) (Math.random()*1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main="+Thread.currentThread().getName());
		}
	}
	
}
