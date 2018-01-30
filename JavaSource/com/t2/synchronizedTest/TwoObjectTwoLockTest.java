package com.t2.synchronizedTest;

/**
 * 关键字synchronized取得的锁都是对象锁，多个线程访问多个对象，则JVM会创建多个锁。
 * 所以b会先打印完在打印a 两个线程两个对象不存在相互等待状态
 * @author Administrator
 * @date 2017-10-25
 */
public class TwoObjectTwoLockTest {

	public static void main(String[] args) {
		HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
		HasSelfPrivateNum hasSelfPrivateNum2 = new HasSelfPrivateNum();
		
		ThreadA threadA = new ThreadA(hasSelfPrivateNum);
		threadA.start();
		
		ThreadB threadB = new ThreadB(hasSelfPrivateNum2);
		threadB.start();
		
	}
	
}
