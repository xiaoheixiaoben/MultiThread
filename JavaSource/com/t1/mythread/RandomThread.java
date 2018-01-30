package com.t1.mythread;

/**
 * 线程调用的随机性
 * @author Administrator
 * @date 2017-10-23
 */
public class RandomThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int time = (int) (Math.random()*1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run = "+Thread.currentThread().getName());
		}
	}
	
}
