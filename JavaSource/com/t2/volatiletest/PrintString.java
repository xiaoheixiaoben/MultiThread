package com.t2.volatiletest;

public class PrintString implements Runnable{

	volatile private boolean isContinuePrint = true;
	
	public boolean isContinuePrint () {
		return isContinuePrint;
	}
	
	public void setContinuePrint (boolean isContinuePrint) {
		this.isContinuePrint = isContinuePrint;
	}
	
	public void printStringMethod () {
		try {
			while (isContinuePrint) {
				System.out.println("run printStringMethod threadname= "+Thread.currentThread().getName());
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		printStringMethod();
	}
}
