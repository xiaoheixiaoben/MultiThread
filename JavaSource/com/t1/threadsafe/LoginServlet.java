package com.t1.threadsafe;

/**
 * �̰߳�ȫ���⣬���߳�ͬʱ���ʣ���username��password���ܴ���������������̲߳���ȫ
 * ����synchronized�����߳�ͬ��
 * @author Administrator
 * @date 2017-10-23
 */
public class LoginServlet {

	private static String usernamer;
	
	private static String passwordr;
	
	synchronized public static void doPost(String username,String password) {
		usernamer = username;
		if (username.equals("a")) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		passwordr = password;
		System.out.println("username="+usernamer+",password="+password);
	}
}
