package com.t2.volatiletest;

public class PrintStringRun {

	public static void main(String[] args) {
		PrintString printString = new PrintString();
		new Thread(printString).start();
		System.out.println("��Ҫֹͣ��");
		printString.setContinuePrint(false);
	}
	
}
