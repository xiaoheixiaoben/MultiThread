package com.t1.mythread;

/**
 * main方法的执行线程,这个线程是由JVM调用的
 * @author Administrator
 * @date 2017-10-23
 */
public class MainMethodMainThreadTest {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	}
	
}
