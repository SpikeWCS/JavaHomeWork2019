package lab1.computer;

public abstract class Memory {

	public void work() {
		System.out.println("内存 work!");
	}
	public abstract String getName();
	public abstract int getVolume();
	public abstract int getPrice();
	public abstract void setPrice(int newPrice);
}
