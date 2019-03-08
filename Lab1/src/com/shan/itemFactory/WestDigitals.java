package com.shan.itemFactory;

import com.shan.factory.HD;

public class WestDigitals extends HD {
	
	public WestDigitals(String name, int price, int volume) {
		super(name, price, volume);
	}

	@Override
	public void work() {
		System.out.println("HD work!");
	}

}
