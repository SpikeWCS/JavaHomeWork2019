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
//	private String name;
//	private int volume;
//	private int price;
//	
//	public Kingston(String name, int volume, int price) {
//		this.name = name;
//		this.volume = volume;
//		this.price = price;
//	}
//
//	@Override
//	public String getName() {
//		return this.name;
//	}
//	@Override
//	public int getVolume() {
//		return this.volume;
//	}
//	@Override
//	public int getPrice() {
//		return this.price;
//	}
//	@Override
//	public void setPrice(int newPrice) {
//		this.price = newPrice;
//	}
}
