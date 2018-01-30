package com.t2.innerclass;

import com.t2.innerclass.OutClass.InnerClass1;
import com.t2.innerclass.OutClass.InnerClass2;

/**
 * ͬ�������synchronized(class2)��class2�����������߳�ֻ����ͬ����������class2�еľ�̬ͬ������
 * @author Administrator
 * @date 2017-10-31
 */
public class OutClassRun {
	
	public static void main(String[] args) {
		final InnerClass1 innerClass1 = new InnerClass1();
		final InnerClass2 innerClass2 = new InnerClass2();
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				innerClass1.method1(innerClass2);
			}
		},"T1");
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				innerClass1.method2();
			}
		},"T2");
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				innerClass2.method1();
			}
		},"T3");
		
		thread.start();
		thread2.start();
		thread3.start();
	}
	
}
