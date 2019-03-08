package com.shan.itemFactory;

import com.shan.factory.*;

public class Intel extends CPU{
	
	public Intel(String name, int coreNum, int price) {
		super(name, price, coreNum);
	}

	@Override
	public void work() {
		System.out.println("CPU work!");
	}
}
