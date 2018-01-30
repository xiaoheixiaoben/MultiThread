package com.t4.LockMethodTest3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁方法：
 *  hasWaiters() 查询是否有线程正在等待与此锁定有关的condition条件
 * @author Administrator
 * @date 2017-11-14
 */
public class Service {
	
	private ReentrantLock reentrantLock = new ReentrantLock();
	private Condition condition = reentrantLock.newCondition();
	
	public void waitMethod () {
		try {
			reentrantLock.lock();
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			reentrantLock.unlock();
		}
	}
	
	public void notifyMethod () {
		try {
			reentrantLock.lock();
			System.out.println("有没有线程在正在等待 newCondition？"+reentrantLock.hasWaiters(condition)+
					"线程数是多少？"+reentrantLock.getWaitQueueLength(condition));
			condition.signal();
		} finally {
			reentrantLock.unlock();
		}
	}
	
}
