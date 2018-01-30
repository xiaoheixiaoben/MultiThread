package com.t3.snywaitandnotify;

public class WaitThread extends Thread{

	private Object lock;
	
	public WaitThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.waitMethod(lock);
	}
	
}
