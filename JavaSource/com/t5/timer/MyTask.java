package com.t5.timer;

import java.util.Date;
import java.util.TimerTask;

/**
 * Timer TimerTask测试
 * @author Administrator
 *	2017-12-25
 */
public class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("任务执行了，时间为："+new Date());
	}
	
}
