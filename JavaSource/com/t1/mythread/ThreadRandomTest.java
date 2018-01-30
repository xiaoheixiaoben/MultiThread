package com.t1.mythread;

/**
 * 线程启动顺序与start()执行顺序无关
 * @author Administrator
 *
 */
public class ThreadRandomTest {

	public static void main(String[] args) {
		ThreadRandom threadRandom1 = new ThreadRandom(1);
		ThreadRandom threadRandom2 = new ThreadRandom(2);
		ThreadRandom threadRandom3 = new ThreadRandom(3);
		ThreadRandom threadRandom4 = new ThreadRandom(4);
		ThreadRandom threadRandom5 = new ThreadRandom(5);
		ThreadRandom threadRandom6 = new ThreadRandom(6);
		ThreadRandom threadRandom7 = new ThreadRandom(7);
		ThreadRandom threadRandom8 = new ThreadRandom(8);
		ThreadRandom threadRandom9 = new ThreadRandom(9);
		ThreadRandom threadRandom10 = new ThreadRandom(10);
		ThreadRandom threadRandom11 = new ThreadRandom(11);
		
		threadRandom1.start();
		threadRandom2.start();
		threadRandom3.start();
		threadRandom4.start();
		threadRandom5.start();
		threadRandom6.start();
		threadRandom7.start();
		threadRandom8.start();
		threadRandom9.start();
		threadRandom10.start();
		threadRandom11.start();
	}
	
}
