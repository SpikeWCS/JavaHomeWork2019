package com.shan.itemFactory;

import com.shan.factory.Memory;

public class Samsung extends Memory{
	

	public Samsung(String name, int price, int volume) {
		super(name, price, volume);
	}

	@Override
	public void work() {
		System.out.println("Memory work!");
	}
}
