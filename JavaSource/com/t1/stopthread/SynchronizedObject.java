package com.t1.stopthread;

/**
 * 使用stop释放所将会给数据造成不一致性的结果。
 * @author Administrator
 *
 */
public class SynchronizedObject extends Thread{
	
	private String username = "a";
	private String password = "aa";
	
	synchronized public void printString (String name,String password) {
		this.username = name;
		try {
			System.out.println("同步 sleep begin");
			Thread.sleep(10000);
			System.out.println("同步 sleep end");
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
