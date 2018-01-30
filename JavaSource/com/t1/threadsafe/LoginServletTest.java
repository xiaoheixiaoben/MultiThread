package com.t1.threadsafe;

public class LoginServletTest {

	public static void main(String[] args) {
		ALogin aLogin = new ALogin();
		aLogin.start();
		BLogin bLogin = new BLogin();
		bLogin.start();
	}
	
}
