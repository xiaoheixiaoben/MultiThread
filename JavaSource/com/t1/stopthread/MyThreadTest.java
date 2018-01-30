package com.t1.stopthread;

/**
 * 强制停止线程，会初选同步锁数据不一致
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
//			System.out.println(Thread.currentThread().getName()+"线程小睡一下begin");
			Thread.sleep(1000);
//			System.out.println(Thread.currentThread().getName()+"线程小睡一下end");
			myThread.stop();
			System.out.println(object.getUsername()+" "+object.getPassword());
//			System.out.println(Thread.currentThread().getName()+"线程大睡一下begin");
//			Thread.sleep(20000);
//			System.out.println(Thread.currentThread().getName()+"宪政大睡一下end");
//			System.out.println(object.getUsername()+" "+object.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
