package com.t3.snywaitandnotify;

public class NotifyThread extends Thread{

	private Object lock;
	
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	@Override
	public void run() {
		super.run();
		Service service = new Service();
		service.notifyMethod(lock);
	}
	
}
