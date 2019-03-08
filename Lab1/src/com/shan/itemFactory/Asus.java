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
//	private String name;
//	private int speed;
//	private int price;
//	
//	public Asus(String name, int speed, int price) {
//		this.name = name;
//		this.speed = speed;
//		this.price = price;
//	}
//	@Override
//	public String getName() {
//		return name;
//	}
//	@Override
//	public int getSpeed() {
//		return speed;
//	}
//	@Override
//	public int getPrice() {
//		return price;
//	}
//	@Override
//	public void setPrice(int price) {
//		this.price = price;
//	}
//	
}
