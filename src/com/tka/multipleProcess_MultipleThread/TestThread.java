package com.tka.multipleProcess_MultipleThread;

public class TestThread {

	public static void main(String[] args) {

		TableThread tableThread = new TableThread();

		tableThread.setPriority(3);

		tableThread.start();
		
		

		TableThread myThread = new TableThread();

		myThread.setPriority(5);

		myThread.start();

	}

}
