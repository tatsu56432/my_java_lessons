package lesson_12_2;

public class Computer extends TangibleAssets{
	
	private String makerName;
	public Computer(String name, int price, String color , String makerName) {
		super(name, price, color);
		this.makerName = makerName;
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return this.getName();
	}
	
	public int getPrice() {
		return this.getPrice();
	}
	
	public String getColor() {
		return this.getColor();
	}
	
	public String getMakerName() {
		return this.makerName;
	}

}
