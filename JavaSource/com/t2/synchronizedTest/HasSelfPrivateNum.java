package com.t2.synchronizedTest;

/**
 * 方法内的变量为线程安全
 * 实例变量非线程安全，
 * 如何解决非线程安全问题？  两个线程访问同一个对象中的同步方法时一定是线程安全的。所以在addI方法增加synchronized关键字
 * @author Administrator
 * @date 2017-10-25
 */
public class HasSelfPrivateNum {
	int num1 = 0;
	synchronized public  void addI (String username) {
		try {
			int num = 0;
			if (username.equals("a")) {
				num = 100;
				num1 = 100;
				System.out.println("a set over");
				Thread.sleep(2000);
			} else {
				num = 200;
				num1 = 200;
				System.out.println("b set over");
			}
			System.out.println(username+" num = "+num);
			System.out.println(username+" num1 = "+num1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
