package com.t1.mythread;

/**
 * �̹߳������
 * @author Administrator
 *
 */
public class ShareVarThread extends Thread{

	private int count = 5;
	
	@Override
	synchronized public void run() {
		super.run();
		/*while (count > 0) {*/
			count--;
			System.out.println("��"+this.currentThread().getName()+"���㣬count = "+count);
		/*}*/
	}
	
}
