package com.t2.innerclass;

/**
 * 内部类与静态内部类
 * @author Administrator
 * @date 2017-10-31
 */
public class PublicClass {
	
	static private String username;
	
	static private String password;
	
	static class PrivateClass {
		
		private String age;
		
		private String address;

		public String getAge() {
			return age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		
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
