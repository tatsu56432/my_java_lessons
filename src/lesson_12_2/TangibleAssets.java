package lesson_12_2;

public abstract class TangibleAssets {

	private String name;
	private int price;
	private String color;
	
	public TangibleAssets(String name , int price , String color) {
		this.name = name;
		this.price = price;
		this.color = color;	
	}

	
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}
	
	
}
