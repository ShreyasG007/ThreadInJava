package com.tka.multipleProcess_oneThread;

 public class Process_Thread {
	
	 public void tableOfSeven() {

		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(7 * i);
		}
	}

	public void tableOfThree() {

		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(3* i);
		}
	}
}
