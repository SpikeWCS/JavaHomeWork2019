package lab1.store;

import lab1.computer.CPU;
import lab1.computer.Computer;
import lab1.computer.HD;
import lab1.computer.Intel;
import lab1.computer.Memory;
import lab1.computer.Samsung;
import lab1.computer.Seagate;

public class ComputerStore {
	
	private Computer computer1;
	private Computer computer2;
	private Computer computer3;
	
	public ComputerStore(Computer computer1, Computer computer2, Computer computer3) {
		this.computer1 = computer1;
		this.computer2 = computer2;
		this.computer3 = computer3;
	}
	
	public void printGoods() {
		System.out.println("本店包含商品为：");
		System.out.println(computer1.getName());
		System.out.println(computer2.getName());
		System.out.println(computer3.getName());
	}
	
	public void printPrice() {
		System.out.println("本店商品价格为: ");
		System.out.println("" + computer1.getName() + "的价格: " + computer1.getPrice());
		System.out.println("" + computer2.getName() + "的价格: " + computer2.getPrice());
		System.out.println("" + computer3.getName() + "的价格: " + computer3.getPrice());
	}
	
	public void printDescribe() {
		System.out.println("商品描述为: ");
		System.out.println("" + computer1.getName() + "的描述: " + computer1.getDescribe());
		System.out.println("" + computer2.getName() + "的描述: " + computer2.getDescribe());
		System.out.println("" + computer3.getName() + "的描述: " + computer3.getDescribe());
	}
	
	public void work() {
		System.out.println("" + computer1.getName() + "开始工作:");
		computer1.work();
		
		System.out.println("" + computer2.getName() + "开始工作:");
		computer2.work();
		
		System.out.println("" + computer3.getName() + "开始工作:");
		computer3.work();
	}
	
	public static void main(String[] args) {
		
		CPU cpu1 = new Intel("x86", 4, 1000);
		Memory memory1 = new Samsung("三星1", 4, 123);
		HD hd1 = new Seagate("SeagateHD1", 4, 500);
		
		ComputerStore store1 = new ComputerStore(computer1, computer2, computer3);
	}

}
