package com.shan.itemFactory;

import com.shan.factory.*;

public class Intel extends CPU{
	
	public Intel(String name, int coreNum, int price) {
		super(name, price, coreNum);
	}
//	
//	@Override
//	public String getName() {
//		return this.name;
//	}
//	@Override
//	public int getCoreNum() {
//		return this.coreNum;
//	}
//	@Override
//	public int getPrice() {
//		return this.price;
//	}
//	@Override
//	public void setPrice(int newPrice) {
//		this.price = newPrice;
//	}

	@Override
	public void work() {
		System.out.println("CPU work!");
	}
}
