package com.t5.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test3 {
	
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��"+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)- 100);
		Date date = calendar.getTime();
		System.out.println("�ƻ�ʱ��Ϊ��"+date);
		MyTask myTask = new MyTask();
		Timer timer = new Timer(true); 
		timer.schedule(myTask, date);
	}
	
}
