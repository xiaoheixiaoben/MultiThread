package com.t6.singleton;

/**
 * 多线程中单例模式的懒汉式加载，Double-check locking  
 * DCL双重检查锁解决懒汉模式多线程问题
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
