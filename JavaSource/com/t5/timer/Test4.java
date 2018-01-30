package com.t5.timer;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Timer中允许有多个TimerTask任务及延时执行
 * @author Administrator
 *
 */
public class Test4 {
	
	public static void main(String[] args) {
		System.out.println("当前时间为："+new Date());
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.SECOND, 10);
		Date date1 = calendar1.getTime();
		System.out.println("计划时间："+date1);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.add(Calendar.SECOND, 20);
		Date date2 = calendar2.getTime();
		System.out.println("计划时间："+date2);
		
		MyTask myTask1 = new MyTask();
		MyTask myTask2 = new MyTask();
		
		Timer timer = new Timer();
		timer.schedule(myTask1, date1);
		timer.schedule(myTask2, date2);
	}
	
}
