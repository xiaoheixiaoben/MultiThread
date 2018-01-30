package com.t1.suspendandresume;

/**
 * suspend resume ÔÝÍ£ºÍ»Ö¸´Ïß³Ì
 * @author Administrator
 * @date 2017-10-24
 */
public class MyThreadTest {

	public static void main(String[] args) {
		try {
			MyThread myThread = new MyThread();
			myThread.start();
			Thread.sleep(5000);
			// A 
			myThread.suspend();
			System.out.println("A "+System.currentTimeMillis()+" i="+myThread.getL());
			Thread.sleep(5000);
			System.out.println("A "+System.currentTimeMillis()+" i="+myThread.getL());
			// B 
			myThread.resume();
			Thread.sleep(5000);
			// C
			myThread.suspend(); 
			System.out.println("B "+System.currentTimeMillis()+" i="+myThread.getL());
			Thread.sleep(5000);
			System.out.println("B "+System.currentTimeMillis()+" i="+myThread.getL());	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
