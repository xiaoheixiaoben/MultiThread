package com.t2.synchronizedTest;

/**
 * �����ڵı���Ϊ�̰߳�ȫ
 * ʵ���������̰߳�ȫ��
 * ��ν�����̰߳�ȫ���⣿  �����̷߳���ͬһ�������е�ͬ������ʱһ�����̰߳�ȫ�ġ�������addI��������synchronized�ؼ���
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
