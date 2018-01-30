package com.t4.UseConditionWaitNotifyOK;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ʹ��Condition����ʵ�ֹؼ���Synchronized��wait()��notify()/notifyAll()�������ϵĵȴ���֪ͨģʽ��
 * @author Administrator
 * @date 2017-11-13
 */
public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void await() {
		try {
			lock.lock();
			System.out.println("awaitʱ��Ϊ"+System.currentTimeMillis());
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
			System.out.println("signalʱ��Ϊ"+System.currentTimeMillis());
			condition.signal();
		} finally {
			lock.unlock();
		}
	}
	
}
