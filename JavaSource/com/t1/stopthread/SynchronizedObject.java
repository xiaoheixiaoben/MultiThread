package com.t1.stopthread;

/**
 * ʹ��stop�ͷ��������������ɲ�һ���ԵĽ����
 * @author Administrator
 *
 */
public class SynchronizedObject extends Thread{
	
	private String username = "a";
	private String password = "aa";
	
	synchronized public void printString (String name,String password) {
		this.username = name;
		try {
			System.out.println("ͬ�� sleep begin");
			Thread.sleep(10000);
			System.out.println("ͬ�� sleep end");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
