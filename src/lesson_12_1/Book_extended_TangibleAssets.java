package lesson_12_1;

public class Book_extended_TangibleAssets extends TangibleAssets {

	
	private String isbn;
	
	public Book_extended_TangibleAssets(String name, int price, String color , String isbn) {
		super(name, price, color);
		this.isbn = isbn;
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
	
	public String getIsbn() {
		return this.isbn;
	}
	
	

}
