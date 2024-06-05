package com.tka.oneProcess_MultipleThread;

public class Process_Thread {
	
	synchronized public void printTable() {

		for (int i = 1; i <= 10; i++) {
			
			System.out.println(Thread.currentThread().getName() + " : " + i);

		}
	}
}
