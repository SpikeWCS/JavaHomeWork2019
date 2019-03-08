package com.shan.factory;

public abstract class HD extends ComputerItem {
	
	protected int volume;
	
	public HD(String name, int price, int volume) {
		super(name, price, "HD");
		this.volume = volume;
	}

//	public void work() {
//		System.out.println("硬盘 work!");
//	}
//	
//	public abstract String getName();
//	public abstract int getVolume();
//	public abstract int getPrice();
//	public abstract void setPrice(int newPrice);
}
