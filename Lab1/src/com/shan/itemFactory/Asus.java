package com.shan.itemFactory;

import com.shan.factory.Mainboard;

public class Asus extends Mainboard{
	
	public Asus(String name, int price, int speed) {
		super(name, price, speed);
	}

	@Override
	public void work() {
		System.out.println("Mainboard work!");
	}

}
