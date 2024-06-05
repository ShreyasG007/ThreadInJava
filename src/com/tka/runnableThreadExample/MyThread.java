package com.tka.runnableThreadExample;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Helloo");
	}

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);

		thread.start();
	}
}
