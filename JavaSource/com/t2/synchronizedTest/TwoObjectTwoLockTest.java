package com.t2.synchronizedTest;

/**
 * �ؼ���synchronizedȡ�õ������Ƕ�����������̷߳��ʶ��������JVM�ᴴ���������
 * ����b���ȴ�ӡ���ڴ�ӡa �����߳��������󲻴����໥�ȴ�״̬
 * @author Administrator
 * @date 2017-10-25
 */
public class TwoObjectTwoLockTest {

	public static void main(String[] args) {
		HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
		HasSelfPrivateNum hasSelfPrivateNum2 = new HasSelfPrivateNum();
		
		ThreadA threadA = new ThreadA(hasSelfPrivateNum);
		threadA.start();
		
		ThreadB threadB = new ThreadB(hasSelfPrivateNum2);
		threadB.start();
		
	}
	
}
