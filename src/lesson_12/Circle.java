package lesson_12;

public class Circle extends Shape{

	private Point center;
	private int radious;
	
	public Circle() {
		this.center = new Point();		
	}
	
	public Circle(int x, int y, int r) {
		
		this.center = new Point(x,y);
		this.radious = r;
		
	}

	public Point getCenter() {
		return this.center;
	}

	public int getRadious() {
		return this.radious;
	}
	
	
	public void draw() {
		
		Point point = this.getCenter();
		int start_point = point.getX();
		int end_point = point.getY();
		System.out.println("‰~‚ğ•`‰æA’†S“_"+ start_point + "," + end_point + "‚©‚ç”¼Œa" + this.getRadious());
		
	}
	
	public double perimeter() {
	
		double result;
		
		int radious = this.getRadious();
		
		result = (radious * 2) * Math.PI;
		
		return result;
		
	}

}
