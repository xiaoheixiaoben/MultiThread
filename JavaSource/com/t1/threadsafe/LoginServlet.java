package com.t1.threadsafe;

/**
 * 线程安全问题，多线程同时访问，在username和password可能传过来的数据造成线程不安全
 * 增加synchronized进行线程同步
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
