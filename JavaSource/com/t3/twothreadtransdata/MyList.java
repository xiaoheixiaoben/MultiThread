package com.t3.twothreadtransdata;

import java.util.List;
import java.util.ArrayList;

/**
 * ��ʹ�õȴ���֪ͨ����ʵ���̼߳�ͨ�ţ�ʹ��sleep���while(true)��ѭ��ʵ��ͨ��
 * @author Administrator
 * @date 2017-11-02
 */
public class MyList {
	
	private List list = new ArrayList();
	
	public void add () {
		list.add("xiaohei");
	}
	
	public int size () {
		return list.size();
	}
	
}
