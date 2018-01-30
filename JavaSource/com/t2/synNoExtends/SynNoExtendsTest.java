package com.t2.synNoExtends;

/**
 *  �� ���� serviceMethod����   ����synchronized ������£���ͬ������
 *  int sub ��һ�� sleep begin threadName=A time = 1508917956963
 *  int sub ��һ�� sleep begin threadName=B time = 1508917956963
 *  int sub ��һ�� sleep end threadName=A time = 1508917961963
 *  int main ��һ�� sleep begin threadName=A time = 1508917961963
 *  int sub ��һ�� sleep end threadName=B time = 1508917961964
 *  int main ��һ�� sleep end threadName=A time = 1508917966964
 *  int main ��һ�� sleep begin threadName=B time = 1508917966964
 *  int main ��һ�� sleep end threadName=B time = 1508917971964
 *  �� ���� serviceMethod����   ��synchronized ������£��첽
 * 	int sub ��һ�� sleep begin threadName=A time = 1508917874390
 * 	int sub ��һ�� sleep end threadName=A time = 1508917879391
 * 	int main ��һ�� sleep begin threadName=A time = 1508917879391
 * 	int main ��һ�� sleep end threadName=A time = 1508917884391
 * 	int sub ��һ�� sleep begin threadName=B time = 1508917884391
 * 	int sub ��һ�� sleep end threadName=B time = 1508917889391
 * 	int main ��һ�� sleep begin threadName=B time = 1508917889391
 * 	int main ��һ�� sleep end threadName=B time = 1508917894392
 * @author Administrator
 * @date 2017-10-25
 */
public class SynNoExtendsTest {

	public static void main(String[] args) {
		Sub sub = new Sub();
		ThreadA threadA = new ThreadA(sub);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(sub);
		threadB.setName("B");
		threadB.start();
	}
	
}
