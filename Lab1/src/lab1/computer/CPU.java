package lab1.computer;

public abstract class CPU {
	
	public void work() {
		System.out.println("CPU work!");
	}
	
	public abstract String getName();
	public abstract int getCoreNum();
	public abstract int getPrice();
	public abstract void setPrice(int newPrice);
}
