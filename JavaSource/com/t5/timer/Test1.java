package com.t5.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("��ǰʱ��Ϊ��"+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 10);
		Date date = calendar.getTime();
		
		MyTask myTask = new MyTask();
		Timer timer = new Timer();
		timer.schedule(myTask, date);
	}
	
}
