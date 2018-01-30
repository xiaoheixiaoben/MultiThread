package com.t3.snywaitandnotify;

public class Test {
	
	public static void main(String[] args) {
		Object lock = new Object();
		WaitThread thread = new WaitThread(lock);
		thread.start();
		
		/*WaitThread thread2 = new WaitThread(lock);
		thread2.start();*/
		
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
		
		NotifyThread notifyThread2 = new NotifyThread(lock);
		notifyThread2.start();
	}
	
}
