package com.tka.multipleProcess_MultipleThread;

public class TableThread extends Thread {

	static Process_Thread process_Thread = new Process_Thread();

	@Override

	public void run() {

		process_Thread.tableOfThree();
		
		process_Thread.tableOfSeven();
	}
}
