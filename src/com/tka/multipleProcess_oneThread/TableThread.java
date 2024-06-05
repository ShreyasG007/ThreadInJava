package com.tka.multipleProcess_oneThread;

public class TableThread extends Thread {

	Process_Thread process_Thread = new Process_Thread();

	@Override

	public void run() {

		process_Thread.tableOfThree();
		System.out.println("**********************");
		process_Thread.tableOfSeven();
	}
}
