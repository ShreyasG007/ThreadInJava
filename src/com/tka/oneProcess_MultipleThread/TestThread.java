package com.tka.oneProcess_MultipleThread;

public class TestThread {

	public static void main(String[] args) {

		Process_Thread process_Thread = new Process_Thread();

		TableThread tableThread = new TableThread(process_Thread);

		tableThread.start();

		TableThread myThread = new TableThread(process_Thread);

		myThread.start();

	}

}
