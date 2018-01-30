package com.t1.sleep;

/**
 * sleep·½·¨
 * @author Administrator
 * @date 2017-10-24
 */
public class SleepThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("run threadname="+this.currentThread()+" begin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run threadname="+this.currentThread()+" end");
	}
}
