package com.t1.isalive;

/**
 * �жϵ�ǰ�߳��Ƿ��ڻ״̬
 * @author Administrator
 * @date 2017-10-24
 */
public class MyThread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("run="+this.isAlive());
	}
}
