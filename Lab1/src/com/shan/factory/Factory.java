package com.shan.factory;

import com.shan.itemFactory.ComputerFactory;

public abstract class Factory {
	public static Factory getFactory(String factoryClassName) {
		Factory factory = new ComputerFactory();
//		try {
//			//factory = (Factory)Class.forName(factoryClassName).newInstance();
//			//factory = new ComputerFactory();
//			
//		} catch (ClassNotFoundException e) {
//			System.out.println("没有找到" + factoryClassName);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		return factory;
	}
	
	public abstract CPU creatCPU(String name, int price, int coreNum, String brand);
	public abstract HD creatHD(String name, int price, int volume, String brand);
	public abstract Mainboard creatMainboard(String name, int price, int speed, String brand);
	public abstract Memory creatMemory(String name, int price, int volume, String brand);
	public abstract Computer creatComputer(String name);
}
