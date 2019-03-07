package lab1.computer;

public class Gigabyte extends Mainboard{
	
	private String name;
	private int speed;
	private int price;
	
	public Gigabyte(String name, int speed, int price) {
		this.name = name;
		this.speed = speed;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getSpeed() {
		return speed;
	}
	@Override
	public int getPrice() {
		return price;
	}
	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	
}
