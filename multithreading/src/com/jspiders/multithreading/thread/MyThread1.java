package com.jspiders.multithreading.thread;

public class MyThread1 extends Thread {

	@Override
	public void run() {
		 for (int i = 0;i < 5;i++) {
			 System.out.println("My Thread 1 is running");	
		}
		}
	
}
