package com.t3.twothreadtransdata;

import org.w3c.dom.ls.LSInput;

public class ThreadB extends Thread{

	private MyList list;
	
	public ThreadB(MyList list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			synchronized (list) {
				if (list.size() != 5) {
					System.out.println("begin wait");
					list.wait();
					System.out.println("end wait");
				}
			}
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
