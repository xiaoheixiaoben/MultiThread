package com.t1.currentthread;

/**
 * 
 * @author Administrator
 * @date 2017-10-24
 */
public class MyThread extends Thread{

	public MyThread() {
		System.out.println("���췽���Ĵ�ӡ��"+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("run�����Ĵ�ӡ��"+Thread.currentThread().getName());
	}
}
