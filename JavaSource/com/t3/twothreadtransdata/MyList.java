package com.t3.twothreadtransdata;

import java.util.List;
import java.util.ArrayList;

/**
 * 不使用等待、通知机制实现线程间通信；使用sleep结合while(true)死循环实现通信
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
