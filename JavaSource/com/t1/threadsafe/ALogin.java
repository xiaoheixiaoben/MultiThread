package com.t1.threadsafe;

public class ALogin extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		LoginServlet.doPost("a", "aa");
	}
	
}
