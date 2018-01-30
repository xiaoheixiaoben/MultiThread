package com.t3.snywaitandnotify;

/**
 * ������wait()��ִ�к������Զ��ͷţ���ִ����notify��������ȴ���Զ��ͷš�
 * @author Administrator
 *
 */
public class Service {

	public void waitMethod (Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait () ThreadName "+Thread.currentThread().getName());
				lock.wait();
				System.out.println("end wait () ThreadName "+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void notifyMethod (Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin notify () ThreadName "+Thread.currentThread().getName());
				lock.notify();
				Thread.sleep(5000);
				System.out.println("end notify () ThreadName "+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
