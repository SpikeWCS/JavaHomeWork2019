package lab1.computer;

public abstract class HD {
	
	public void work() {
		System.out.println("硬盘 work!");
	}
	
	public abstract String getName();
	public abstract int getVolume();
	public abstract int getPrice();
	public abstract void setPrice(int newPrice);
}
