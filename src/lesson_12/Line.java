package lesson_12;

public class Line implements Figure{
	
	private Point p1;
	private Point p2;

	public Line() {
		this.p1 = new Point();
		this.p2 = new Point();
		
	}
	
	public Line(int x1,int y1, int x2 , int y2) {
		this.p1 = new Point(x1,y1);
		this.p2 = new Point(x2,y2);		
	}
	
	
	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}
	
	public void setP2(Point p2) {
		this.p2 = p2;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("線を描画" + this.get +);
		
		
	}




	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}





	
	
	
}
