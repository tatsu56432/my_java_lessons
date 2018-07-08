package lesson_12;

public class Triangle extends Polygon {

	private Point p1;
	private Point p2;
	private Point p3;
	
	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	public Point getP3() {
		return p3;
	}

	
	public Triangle(int x1,int y1,int x2,int y2,int x3,int y3) {	
		
		this.p1 = new Point(x1,y1);
		this.p2 = new Point(x2,y2);
		this.p3 = new Point(x3,y3);
		
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub		
		Point point1 = this.getP1();
		Point point2 = this.getP2();
		Point point3 = this.getP3();		
		System.out.println("三角形を描画、点"+ point1.getX() + "," + point1.getY() + "から点２" + point2.getX() + "," + point2.getY() + "、点３"+ point3.getX() + "," + point3.getY()   +"までの三角形");
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		Point point1 = this.getP1();
		Point point2 = this.getP2();
		Point point3 = this.getP3();
		
		int side_1 = (point1.getY() - point1.getY());
		int side_2 = (point2.getY() - point2.getY());
		int side_3 = (point3.getY() - point3.getY());
		
		double result = (side_1 + side_2 + side_3);
		
		return result;
	}

}
