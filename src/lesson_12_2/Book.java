package lesson_12_2;

public class Book extends TangibleAssets{

private String isbn;
	
	public Book(String name, int price, String color , String isbn) {
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
