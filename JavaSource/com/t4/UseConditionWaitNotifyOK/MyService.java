package com.t4.UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Condition对象实现关键字Synchronized与wait()和notify()/notifyAll()方法相结合的等待、通知模式。
 * @author Administrator
 * @date 2017-11-13
 */
public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			lock.lock();
			System.out.println("await时间为"+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public void signal() {
		try {
			lock.lock();
			System.out.println("signal时间为"+System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
	
}
