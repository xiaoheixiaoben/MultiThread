package com.t2.synchronizedMethondLockObject;

/**
 * A�߳��ȳ���object�����Lock����B�߳��������ʱ����object�����е�synchronized���͵ķ�������Ҫ�ȴ���Ҳ����ͬ��
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