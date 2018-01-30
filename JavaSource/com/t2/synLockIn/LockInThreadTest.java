package com.t2.synLockIn;

/**
 * 锁重入在父类与子类中
 * @author Administrator
 * @date 2017-10-25
 */
public class LockInThreadTest {

	public static void main(String[] args) {
		LockInThread lockInThread = new LockInThread();
		lockInThread.start();
	}
	
}
