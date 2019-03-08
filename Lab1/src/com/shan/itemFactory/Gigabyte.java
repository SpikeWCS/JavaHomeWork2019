package com.shan.itemFactory;

import com.shan.factory.Mainboard;

public class Gigabyte extends Mainboard{
	
	public Gigabyte(String name, int price, int speed) {
		super(name, price, speed);
	}

	@Override
	public void work() {
		System.out.println("Mainboard work!");
	}
	
}
