package com.shan.factory;
// 抽象表示 CPU 的类
public abstract class CPU extends ComputerItem {

	protected int coreNum;
	
	public CPU(String name, int price, int coreNum) {
		super(name, price, "CPU");
		this.coreNum = coreNum;
	}
	
//	public void work() {
//		System.out.println("CPU work!");
//	}
//	
//	public abstract String getName();
//	public abstract int getCoreNum();
//	public abstract int getPrice();
//	public abstract void setPrice(int newPrice);
}
