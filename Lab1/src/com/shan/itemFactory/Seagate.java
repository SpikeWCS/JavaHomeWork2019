package com.shan.itemFactory;

import com.shan.factory.HD;

public class Seagate extends HD	{
	
	public Seagate(String name, int price, int volume) {
		super(name, price, volume);
	}

	@Override
	public void work() {
		System.out.println("HD work!");
	}

}
