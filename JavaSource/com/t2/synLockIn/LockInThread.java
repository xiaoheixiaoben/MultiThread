package com.t2.synLockIn;

/**
 * �������ڸ�����������
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
