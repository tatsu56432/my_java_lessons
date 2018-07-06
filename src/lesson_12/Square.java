package lesson_12;

public class Square extends Rectangle{

	public Square(int x, int y, int width) {
		super(x, y, width, 0);
		// TODO Auto-generated constructor stub
	}
	
	public void draw() {
		
		int point_x = p.getX();
		int point_y = p.getY();
		int width = this.width;
		int height = this.height;
		System.out.println("正方刑を描画" + point_x +"," + point_y +" を描画する"+ "幅高さは"+ width +"を描画する");
	}
	
	public double perimeter() {
		double result;
		int width = this.width;
		result = width *4;
		
		return result;
	}
}
