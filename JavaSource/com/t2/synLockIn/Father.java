package com.t2.synLockIn;

/**
 * �������ڸ�����������
 * @author Administrator
 * @date 2017-10-25
 */
public class Father {

	public int i = 11;
	
	synchronized public void operateIFatherMethod () {
		try {
			i--;
			System.out.println("Father print i ="+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
