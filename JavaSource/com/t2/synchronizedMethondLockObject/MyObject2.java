package com.t2.synchronizedMethondLockObject;

/**
 * A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需要等待，也就是同步
 * @author Administrator
 * @date 2017-10-25
 */
public class MyObject2 {
	
	synchronized public void methodA() {
		try {
			System.out.println("begin methodA threadName="+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("a end");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	synchronized public void methodB() {
		try {
			System.out.println("begin methodB threadName="+Thread.currentThread().getName());
			Thread.sleep(5000);
			System.out.println("b end");
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
