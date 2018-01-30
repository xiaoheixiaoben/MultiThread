package com.t1.getid;

public class Test {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" "+thread.getId());
	}
	
}
