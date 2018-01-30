package com.t5.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test1 {
	
	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.SECOND, 10);
		Date date = calendar.getTime();
		
		MyTask myTask = new MyTask();
		Timer timer = new Timer();
		timer.schedule(myTask, date);
	}
	
}
