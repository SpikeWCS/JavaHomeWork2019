package com.shan.itemFactory;

import com.shan.factory.Memory;

public class Kingston extends Memory {
	
	public Kingston(String name, int price, int volume) {
		super(name, price, volume);
	}

	@Override
	public void work() {
		System.out.println("Memory work!");
	}

}
