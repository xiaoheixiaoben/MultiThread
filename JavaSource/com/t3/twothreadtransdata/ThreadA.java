package com.t3.twothreadtransdata;

public class ThreadA extends Thread{

	private MyList list;
	
	public ThreadA(MyList list) {
		super();
		this.list = list;
	}
	
	@Override
	public void run() {
		try {
			synchronized (list) {
				for (int i = 0; i < 10; i++) {
					list.add();
					if (list.size() == 5) {
						list.notify();
						System.out.println("发出通知");
					}
					System.out.println("添加了"+(i+1)+"个元素");
					Thread.sleep(1000);
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
