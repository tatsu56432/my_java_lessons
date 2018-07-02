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

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadious() {
		return this.radious;
	}

	public void setRadious(int radious) {
		this.radious = radious;
	}
	
	
	
	
}
