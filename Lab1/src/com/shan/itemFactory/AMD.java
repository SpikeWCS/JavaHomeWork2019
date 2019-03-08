package com.shan.itemFactory;

import com.shan.factory.CPU;

public class AMD extends CPU {

	public AMD(String name, int coreNum, int price) {
		super(name, price, coreNum);
	}

	@Override
	public void work() {
		System.out.println("CPU work!");
	}
}
