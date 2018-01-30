package com.t4.Reentrantlocktest;

import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock类实现同步
 * @author Administrator
 * @date 2017-11-3
 */

public class MyService {
	
	private Lock lock = new ReentrantLock();
	
	public void testMethod () {
		lock.lock();
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName= "+Thread.currentThread().getName()+" "+(i+1));
		}
		lock.unlock();
	}
}
