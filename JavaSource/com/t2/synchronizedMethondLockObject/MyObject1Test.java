package com.t2.synchronizedMethondLockObject;

/**
 * A�߳��ȳ���object�����Lock����B�߳̿������첽�ķ�ʽ����object�����з�synchronized���͵ķ�����
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