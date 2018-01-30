package com.t1.mythread;

/**
 * 多线程不同享变量
 * @author Administrator
 * @date 2017-10-23
 */
public class NonShareVarThread extends Thread{
	
	private int count = 5;
	
	public NonShareVarThread(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public void run() {
		super.run();
		while (count > 0) {
			count--;
			System.out.println("由"+this.currentThread().getName()+"计算，count = "+count);
		}
	}
}
