package com.t1.stopthread;

/**
 * ǿ��ֹͣ�̣߳����ѡͬ�������ݲ�һ��
 * @author Administrator
 *
 */
public class MyThreadTest {

	public static void main(String[] args) {
		try {
			SynchronizedObject object = new SynchronizedObject();
//			System.out.println(object.getUsername()+" "+object.getPassword());
			MyThread myThread = new MyThread(object);
			myThread.start();
//			System.out.println(Thread.currentThread().getName()+"�߳�С˯һ��begin");
			Thread.sleep(1000);
//			System.out.println(Thread.currentThread().getName()+"�߳�С˯һ��end");
			myThread.stop();
			System.out.println(object.getUsername()+" "+object.getPassword());
//			System.out.println(Thread.currentThread().getName()+"�̴߳�˯һ��begin");
//			Thread.sleep(20000);
//			System.out.println(Thread.currentThread().getName()+"������˯һ��end");
//			System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
