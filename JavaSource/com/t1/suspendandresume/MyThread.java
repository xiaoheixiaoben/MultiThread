package com.t1.suspendandresume;

public class MyThread extends Thread{

	private long l = 0;

	public long getL() {
		return l;
	}

	public void setL(long l) {
		this.l = l;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			l++;
		}
	}
	
}
