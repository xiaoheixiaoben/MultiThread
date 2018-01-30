package com.t2.synchronizedTest;

/**
 * 方法内的变量为线程安全的
 * 实例变量非线程安全    
 * 如何解决非线程安全问题？  两个线程访问同一个对象中的同步方法时一定是线程安全的。所以在addI方法增加synchronized关键字
 * a打印完在打印b 同一个对象a线程先访问  b线程处于等待状态
 * @author Administrator
 * @date 2017-10-25
 */
public class HasSelfPrivateNumTest {

	public static void main(String[] args) {
		HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
		
		ThreadA threadA = new ThreadA(hasSelfPrivateNum);
		threadA.start();
		
		ThreadB threadB = new ThreadB(hasSelfPrivateNum);
		threadB.start();
		
	}
	
}
