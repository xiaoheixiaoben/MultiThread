package com.t2.synchronizedTest;

/**
 * 方法内的变量为线程安全的
 * 实例变量非线程安全
 * @author Administrator
 * @date 2017-10-25
 */
public class ThreadA extends Thread{

	private HasSelfPrivateNum hasSelfPrivateNum ;
	
	public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
		this.hasSelfPrivateNum = hasSelfPrivateNum;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		hasSelfPrivateNum.addI("a");
	}
	
}
