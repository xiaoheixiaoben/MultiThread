package com.t2.synchronizedTest;

/**
 * �����ڵı���Ϊ�̰߳�ȫ��
 * ʵ���������̰߳�ȫ    
 * ��ν�����̰߳�ȫ���⣿  �����̷߳���ͬһ�������е�ͬ������ʱһ�����̰߳�ȫ�ġ�������addI��������synchronized�ؼ���
 * a��ӡ���ڴ�ӡb ͬһ������a�߳��ȷ���  b�̴߳��ڵȴ�״̬
 * @author Administrator
 * @date 2017-10-25
 */
public class HasSelfPrivateNumTest {

	public static void main(String[] args) {
		HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
		
		ThreadA threadA = new ThreadA(hasSelfPrivateNum);
		threadA.start();
		
		ThreadB threadB = new ThreadB(hasSelfPrivateNum);
		threadB.start();
		
	}
	
}
