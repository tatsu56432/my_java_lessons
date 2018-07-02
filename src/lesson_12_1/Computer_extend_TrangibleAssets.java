package lesson_12_1;

public class Computer_extend_TrangibleAssets extends TangibleAssets{

	private String makerName;
	public Computer_extend_TrangibleAssets(String name, int price, String color , String makerName) {
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
