package com.tka.threadInJava;

public class Test {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		thread.setName("sub-thread");
		System.out.println(thread.getName());

	}

}
