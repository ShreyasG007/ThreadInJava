package com.tka.oneProcess_MultipleThread;

public class TableThread extends Thread {
	
	Process_Thread process_Thread; 
	
	
	
	
	public TableThread(Process_Thread process_Thread) {
		this.process_Thread = process_Thread;
	}




	@Override
	public void run() {
			
			process_Thread.printTable();
	}
}
