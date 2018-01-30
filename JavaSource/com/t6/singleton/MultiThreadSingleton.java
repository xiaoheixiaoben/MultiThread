package com.t6.singleton;

/**
 * ���߳��е���ģʽ������ʽ���أ�Double-check locking  
 * DCL˫�ؼ�����������ģʽ���߳�����
 * @author Administrator
 *
 */
public class MultiThreadSingleton {

	private volatile MultiThreadSingleton multiThreadSingleton;
	
	private MultiThreadSingleton () {
		
	}
	
	public MultiThreadSingleton getInstance() {
		if (multiThreadSingleton != null) {
			return multiThreadSingleton;
		} else {
			synchronized (MultiThreadSingleton.class) {
				if (multiThreadSingleton == null) {
					multiThreadSingleton = new MultiThreadSingleton();
				}
			}
		}
		return multiThreadSingleton;
	}
}
