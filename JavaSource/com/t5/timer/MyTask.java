package com.t5.timer;

import java.util.Date;
import java.util.TimerTask;

/**
 * Timer TimerTask����
 * @author Administrator
 *	2017-12-25
 */
public class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("����ִ���ˣ�ʱ��Ϊ��"+new Date());
	}
	
}
