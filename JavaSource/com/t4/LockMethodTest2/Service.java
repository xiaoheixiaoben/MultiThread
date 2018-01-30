package com.t4.LockMethodTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 锁方法：
 *  hasQueuedThread() 查询指定的线程是否正在等待获取此锁定
 *  hasQueuedThreads() 查询是否有线程正在等待获取此锁定
 * @author Administrator
 * @date 2017-11-14
 */
public class Service {
	
	public ReentrantLock lock = new ReentrantLock();
	public Condition condition = lock.newCondition();
	
	public void waitMethod() {
		try {
			lock.lock();
			Thread.sleep(Integer.MAX_VALUE);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
}
