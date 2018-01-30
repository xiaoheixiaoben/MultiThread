package com.t3.twothreadtransdata;

public class Test {

	public static void main(String[] args) {
		MyList list = new MyList();
		ThreadB threadB = new ThreadB(list);
		threadB.setName("B");
		threadB.start();
		
		ThreadA threadA = new ThreadA(list);
		threadA.setName("A");
		threadA.start();
		
	
	}
	
}
