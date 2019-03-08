package com.shan.factory;

public abstract class Memory extends ComputerItem {
	
	protected int volume;
	
	public Memory(String name, int price, int volume) {
		super(name, price, "Memory");
		this.volume = volume;
	}
	
//	public void work() {
//		System.out.println("内存 work!");
//	}
//	public abstract String getName();
//	public abstract int getVolume();
//	public abstract int getPrice();
//	public abstract void setPrice(int newPrice);
}
