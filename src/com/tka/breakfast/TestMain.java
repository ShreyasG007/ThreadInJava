package com.tka.breakfast;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		Thread toast = new Thread(new ToastMaker());
		toast.setName("ToastMaker");
		
		Thread coffee = new Thread(new CoffeeMaker());
		coffee.setName("CoffeeMaker");
		
		Thread egg = new Thread(new EggFryer());
		egg.setName("EggFryer");
		
		toast.start();
		coffee.start();
		egg.start();
		
		
		egg.join();
		
		System.out.println("\nBreakFast Is ready");
	}
} 