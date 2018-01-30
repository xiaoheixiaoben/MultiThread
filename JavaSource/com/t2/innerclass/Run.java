package com.t2.innerclass;

import com.t2.innerclass.PublicClass.PrivateClass;
/**
 * 内部类与静态内部类
 * @author Administrator
 * @date 2017-10-31
 */
public class Run {

	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();
		publicClass.setUsername("usernameValue");
		publicClass.setPassword("passwordValue");
		System.out.println(publicClass.getUsername()+"  "+publicClass.getPassword());
		
		PrivateClass privateClass = new PrivateClass();
		privateClass.setAge("age");
		privateClass.setAddress("address");
		System.out.println(privateClass.getAge()+"  "+privateClass.getAddress());
	}
	
}
