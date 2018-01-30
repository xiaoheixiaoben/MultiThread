package com.t1.mythread;

public class NonShareVarThreadTest {

	public static void main(String[] args) {
		NonShareVarThread aNonShareVarThread = new NonShareVarThread("A");
		NonShareVarThread bNonShareVarThread = new NonShareVarThread("B");
		NonShareVarThread cNonShareVarThread = new NonShareVarThread("C");
		
		aNonShareVarThread.start();
		bNonShareVarThread.start();
		cNonShareVarThread.start();
	}
	
}
