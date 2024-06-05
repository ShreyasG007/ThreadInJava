package com.tka.oneProcess_oneThread;

public class Process_Thread {
	public void printTable() {
		
		System.out.println(Thread.currentThread().getName());
		for(int i=1 ; i<=10;i++) {
			System.out.println(2*i);
		}
	}
}
