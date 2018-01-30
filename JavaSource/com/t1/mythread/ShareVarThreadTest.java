package com.t1.mythread;

/**
 * 多线程共享变量，通过synchronized实现线程同步，处理出现非线程安全
 * @author Administrator
 *
 */
public class ShareVarThreadTest {

	public static void main(String[] args) {
		ShareVarThread shareVarThread = new ShareVarThread();
		Thread a = new Thread(shareVarThread, "A");
		Thread b = new Thread(shareVarThread, "B");
		Thread c = new Thread(shareVarThread, "C");
		Thread d = new Thread(shareVarThread, "D");
		Thread e = new Thread(shareVarThread, "E");
		
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
	
}
