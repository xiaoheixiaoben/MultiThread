package com.t1.mythread;

/**
 * 线程共享变量
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
			System.out.println("由"+this.currentThread().getName()+"计算，count = "+count);
		/*}*/
	}
	
}
