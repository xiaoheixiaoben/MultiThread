package com.t4.LockMethodTest3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��������
 *  hasWaiters() ��ѯ�Ƿ����߳����ڵȴ���������йص�condition����
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
			System.out.println("��û���߳������ڵȴ� newCondition��"+reentrantLock.hasWaiters(condition)+
					"�߳����Ƕ��٣�"+reentrantLock.getWaitQueueLength(condition));
			condition.signal();
		} finally {
			reentrantLock.unlock();
		}
	}
	
}
