package com.tka.multipleProcess_MultipleThread;

public class Process_Thread {
	synchronized public void tableOfSeven() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + 7 * i + " table of 7");
		}
	}

	synchronized public void tableOfThree() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + 3 * i+" table of 3");
		}
	}
}
