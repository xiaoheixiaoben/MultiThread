package com.t1.stopthread;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 500000; i++) {
			if (this.interrupted()) {
				System.out.println("�߳��Ѿ���ֹͣ״̬����Ҫ�˳���");
				break;
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("�߳�ֹͣ��for�������仹���Ǽ���ִ�е�");
	}
	
}
