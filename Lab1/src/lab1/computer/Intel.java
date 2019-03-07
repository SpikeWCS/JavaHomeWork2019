package lab1.computer;

public class Intel extends CPU{
	private String name;
	private int coreNum;
	private int price;
	
	public Intel(String name, int coreNum, int price) {
		this.name = name;
		this.coreNum = coreNum;
		this.price = price;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public int getCoreNum() {
		return this.coreNum;
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
