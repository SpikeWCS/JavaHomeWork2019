package lab1.computer;

public abstract class Mainboard {
	
	public void work() {
		System.out.println("主板 work！");
	}
	
	public abstract String getName();
	public abstract int getSpeed();
	public abstract int getPrice();
	public abstract void setPrice(int newPrice);
}
