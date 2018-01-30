package com.t5.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class Test3 {
	
	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)- 100);
		Date date = calendar.getTime();
		System.out.println("计划时间为："+date);
		MyTask myTask = new MyTask();
		Timer timer = new Timer(true); 
		timer.schedule(myTask, date);
	}
	
}
