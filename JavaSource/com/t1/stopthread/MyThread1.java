package com.t1.stopthread;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("线程已经是停止状态，我要退出了");
				break;
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("线程停止，for后面的语句还会是继续执行的");
	}
	
}
