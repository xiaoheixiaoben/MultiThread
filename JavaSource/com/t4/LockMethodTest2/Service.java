package com.t4.LockMethodTest2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ��������
 *  hasQueuedThread() ��ѯָ�����߳��Ƿ����ڵȴ���ȡ������
 *  hasQueuedThreads() ��ѯ�Ƿ����߳����ڵȴ���ȡ������
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
