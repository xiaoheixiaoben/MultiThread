package com.t5.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Timer�������ж��TimerTask������ʱִ��
 * @author Administrator
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��"+new Date());
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.SECOND, 10);
		Date date1 = calendar1.getTime();
		System.out.println("�ƻ�ʱ�䣺"+date1);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.SECOND, 20);
		Date date2 = calendar2.getTime();
		System.out.println("�ƻ�ʱ�䣺"+date2);
		
		MyTask myTask1 = new MyTask();
		MyTask myTask2 = new MyTask();
		
		Timer timer = new Timer();
		timer.schedule(myTask1, date1);
		timer.schedule(myTask2, date2);
	}
	
}
