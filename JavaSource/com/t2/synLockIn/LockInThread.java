package com.t2.synLockIn;

/**
 * 锁重入在父类与子类中
 * @author Administrator
 * @date 2017-10-25
 */
public class LockInThread extends Thread{

	@Override
	public void run() {
		super.run();
		Sub sub = new Sub();
		sub.operateISubMethod();
	}
	
}
