package com.t1.mythread;

/**
 * ���̲߳�ͬ�����
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
			System.out.println("��"+this.currentThread().getName()+"���㣬count = "+count);
		}
	}
}
