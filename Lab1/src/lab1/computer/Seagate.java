package lab1.computer;

public class Seagate extends HD	{
	
	private String name;
	private int volume;
	private int price;
	
	public Seagate(String name, int volume, int price) {
		this.name = name;
		this.volume = volume;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getVolume() {
		return this.volume;
	}
	@Override
	public int getPrice() {
		return this.price;
	}
	@Override
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
}
