package com.shan.homework2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Teacher extends Person {
	private static int counter = 100;
	private static void testStatic() {
		System.out.println("static test()");
	}
	
	private double salary;
	
	public Teacher(){
		
	}
	
	private Teacher(String name, int age, double salary){
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	 public void eat(String something) {  
	    System.out.println("老师在吃" + something);  
	 }  
	      
	 public void eat(String something, int time) {
		 System.out.println("老师在吃" + something + "吃了" + time + "小时");
	 }  
	 
	 @Override  
	 public String toString() {  
	     return "Teacher [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	 }  
	  
	 public static void main(String[] args) {
		try {
			Class<?> teacherClass = Class.forName("com.shan.homework2.Teacher");
			Field[] fields = teacherClass.getFields();	// 得到Teacher类的所有公共字段(包括继承来的)
			System.out.println("----打印所有字段----");
			for (Field field : fields) {
				System.out.println(field);
			}
			fields = teacherClass.getDeclaredFields();	// 得到Teacher类的所有字段(不包括继承来的 包括私有的)
			for (Field field : fields) {
				System.out.println(field);
			}
			
			Constructor[] constructors = teacherClass.getDeclaredConstructors();	// 得到Teacher类的所有构造函数
			System.out.println("----打印所有构造函数----");
			for (Constructor constructor : constructors) {
				System.out.println(constructor);
			}
			
			Class<?> parentClass = teacherClass.getSuperclass();	// 获取teacherClass的父类
			System.out.println("----打印父类----");
			System.out.println(parentClass);
			
			Class<?>[] interfac = parentClass.getInterfaces();	// 得到parentClass的所有接口
			System.out.println("----打印接口----");
			for (Class<?> inter1 : interfac) {
				System.out.println(inter1);
			}
			
			Method[] methods = teacherClass.getDeclaredMethods();
			System.out.println("----打印所有方法----");
			for (Method method : methods) {
				System.out.println(method);
			}
			Method personAddMethod = parentClass.getMethod("AddAge", int.class);
			System.out.println(personAddMethod);
			
			// 获取一个私有构造函数，并创建一个Teacher对象
			Constructor<?> privateCon = teacherClass.getDeclaredConstructor(String.class, int.class, double.class);
			privateCon.setAccessible(true);	// 暴力访问(忽略掉访问修饰符) 
			Object instens = privateCon.newInstance("王强", 38, 1234.5);
			
			Method me1 = teacherClass.getDeclaredMethod("testStatic");
			System.out.println("----调用方法testStatic----");
			me1.invoke(null, null);
			
			Method me2 = teacherClass.getMethod("eat", String.class);
			System.out.println("----调用方法eat(String)----");
			me2.invoke(instens, "大虾");
			
			Method me3 = teacherClass.getMethod("eat", String.class, int.class);
			System.out.println("----调用方法eat(String, int)----");
			me3.invoke(instens, "大虾", 1);
			
			Method me4 = teacherClass.getMethod("toString");
			System.out.println("----调用方法toString()----");
			System.out.println(me4.invoke(instens));
			
			Method me5 = teacherClass.getMethod("AddAge", int.class);
			System.out.println("----调用父类public方法AddAge()----");
			System.out.println(me5.invoke(instens, 1));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
