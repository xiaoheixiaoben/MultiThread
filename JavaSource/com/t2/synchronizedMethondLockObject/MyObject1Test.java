package com.t2.synchronizedMethondLockObject;

/**
 * A线程先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中非synchronized类型的方法。
 * @author Administrator
 * @date 2017-10-25
 */
public class MyObject1Test {
	public static void main(String[] args) {
		MyObject1 myObject1 = new MyObject1();
		ThreadA a = new ThreadA(myObject1);
		a.setName("A");
		ThreadB b = new ThreadB(myObject1);
		b.setName("B");
		a.start();
		b.start();
	}
}