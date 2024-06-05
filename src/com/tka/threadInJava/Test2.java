package com.tka.threadInJava;

public class Test2 {
	public static void main(String[] args) {
		Operations operations = new Operations();
		Thread t1 = Thread.currentThread();
		t1.setName("MainThread");
		
		
		System.out.println("ID : "+t1.getId());
		
		System.out.println("Priority : "+t1.getPriority());
		
		System.out.println("Current Thread : " + t1.getName());

		operations.Hello();

	}
}
