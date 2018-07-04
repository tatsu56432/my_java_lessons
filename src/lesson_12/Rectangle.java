package lesson_12;

public class Rectangle extends Polygon {

	
	private Point p;
	private int width;
	private int height;
	
	
	public Point getP() {
		return this.p;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	public Rectangle(int x, int y,int width,int height) {
		this.p = new Point(x,y);
		this.setWidth(width);
		this.setHeight(height);
		//親クラスのangelに4を代入
		super.angel = 4;
	}
	
	@Override
	public void draw() {	
		
		// TODO Auto-generated method stub		
		Point p = this.getP();
		int start_point = p.getX();
		int end_point = p.getY();
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		System.out.println("四角形を描画 点(" + start_point +","+ end_point + ")を基準として、幅"+ width +"高さ"+ height +"の四角形");
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		
		double result;
		
		int width = this.getWidth();
		int height = this.getHeight();
		
		result = (width + height) * 2;
		
		return result;
	}

	
	
	
}
