package com.t4.ConditionTestMoreMethod;

public class Run {

	public static void main(String[] args) {
		MyService myService = new MyService();
		ThreadA a = new ThreadA(myService);
		a.setName("A");
		a.start();
		ThreadAA aa = new ThreadAA(myService);
		aa.setName("AA");
		aa.start();
		ThreadB b = new ThreadB(myService);
		b.setName("B");
		b.start();
		ThreadBB bb = new ThreadBB(myService);
		bb.setName("BB");
		bb.start();
	}
	
}
