package com.tka.breakfast;

public  class EggFryer implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Egg Frying is making");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Egg Frying is Ready!!!");
	}

}
