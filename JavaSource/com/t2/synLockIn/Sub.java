package com.t2.synLockIn;

/**
 * 锁重入在父类与子类中
 * @author Administrator
 * @date 2017-10-25
 */
public class Sub extends Father{

	synchronized public void operateISubMethod () {
		try {
			while (i > 0) {
				i--;
				System.out.println("Sub print i ="+i);
				Thread.sleep(1000);
				this.operateIFatherMethod();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
