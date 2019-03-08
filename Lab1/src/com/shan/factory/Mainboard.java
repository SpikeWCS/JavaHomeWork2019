package com.shan.factory;

public abstract class Mainboard extends ComputerItem {

	protected int speed;
	
	public Mainboard(String name, int price, int speed) {
		super(name, price, "Mainboard");
		this.speed = speed;
	}
//	public void work() {
//		System.out.println("主板 work！");
//	}
//	
//	public abstract String getName();
//	public abstract int getSpeed();
//	public abstract int getPrice();
//	public abstract void setPrice(int newPrice);
}
