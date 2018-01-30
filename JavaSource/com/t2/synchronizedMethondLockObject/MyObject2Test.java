package com.t2.synchronizedMethondLockObject;

/**
 * A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需要等待，也就是同步
 * @author Administrator
 * @date 2017-10-25
 */
public class MyObject2Test {
	public static void main(String[] args) {
		MyObject2 myObject2 = new MyObject2();
		ThreadA2 a = new ThreadA2(myObject2);
		a.setName("A");
		ThreadB2 b = new ThreadB2(myObject2);
		b.setName("B");
		a.start();
		b.start();
	}
}