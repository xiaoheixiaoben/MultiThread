package com.t2.synNoExtends;

/**
 *  ① 子类 serviceMethod方法   不加synchronized 输出如下，非同步调用
 *  int sub 下一步 sleep begin threadName=A time = 1508917956963
 *  int sub 下一步 sleep begin threadName=B time = 1508917956963
 *  int sub 下一步 sleep end threadName=A time = 1508917961963
 *  int main 下一步 sleep begin threadName=A time = 1508917961963
 *  int sub 下一步 sleep end threadName=B time = 1508917961964
 *  int main 下一步 sleep end threadName=A time = 1508917966964
 *  int main 下一步 sleep begin threadName=B time = 1508917966964
 *  int main 下一步 sleep end threadName=B time = 1508917971964
 *  ② 子类 serviceMethod方法   加synchronized 输出如下，异步
 * 	int sub 下一步 sleep begin threadName=A time = 1508917874390
 * 	int sub 下一步 sleep end threadName=A time = 1508917879391
 * 	int main 下一步 sleep begin threadName=A time = 1508917879391
 * 	int main 下一步 sleep end threadName=A time = 1508917884391
 * 	int sub 下一步 sleep begin threadName=B time = 1508917884391
 * 	int sub 下一步 sleep end threadName=B time = 1508917889391
 * 	int main 下一步 sleep begin threadName=B time = 1508917889391
 * 	int main 下一步 sleep end threadName=B time = 1508917894392
 * @author Administrator
 * @date 2017-10-25
 */
public class SynNoExtendsTest {

	public static void main(String[] args) {
		Sub sub = new Sub();
		ThreadA threadA = new ThreadA(sub);
		threadA.setName("A");
		threadA.start();
		ThreadB threadB = new ThreadB(sub);
		threadB.setName("B");
		threadB.start();
	}
	
}
