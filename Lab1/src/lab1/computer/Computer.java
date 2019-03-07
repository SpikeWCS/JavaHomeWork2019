package lab1.computer;

public class Computer {
	
	private String name;
	private String describe;
	private int price;
	
	private CPU cpu;
	private Memory memory;
	private HD hd;
	private Mainboard mainboard;
	
	public Computer(String name, CPU cpu, Memory memory, HD hd, Mainboard mainboard) {
		this.name = name;
		this.cpu = cpu;
		this.memory = memory;
		this.hd = hd;
		this.mainboard = mainboard;
		this.describe = "CPU: " + cpu.getClass() + " " + cpu.getName() + "\r\n"
					+ "Memory: " + memory.getClass() + " " + memory.getName() + "\r\n"
					+ "HD: " + hd.getClass() + " " + hd.getName() + "\r\n"
					+ "Mainboard: " + mainboard.getClass() + " " + mainboard.getName();
		this.price = cpu.getPrice() + memory.getPrice() + hd.getPrice() + mainboard.getPrice();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescribe() {
		return describe;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void work() {
		cpu.work();
		memory.work();
		hd.work();
		mainboard.work();
	}
}
