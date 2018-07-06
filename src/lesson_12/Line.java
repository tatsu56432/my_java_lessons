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

	public Point getP2() {
		return p2;
	}

	@Override
	public void draw() {		
		int start_point_x1 = this.p1.getX();
		int end_point_y1 = this.p1.getY();
		int start_point_x2 = this.p2.getX();
		int end_point_y2 = this.p2.getY();
		// TODO Auto-generated method stub
		System.out.println("����`��" + start_point_x1 + end_point_y1 + "����I�_" + start_point_x2 + end_point_y2  + "��`��");		
	}


	@Override
	public double perimeter() {
		
		double result;
		
		int start_point_x1 = this.p1.getX();
		int end_point_y1 = this.p1.getY();
		int start_point_x2 = this.p2.getX();
		int end_point_y2 = this.p2.getY();
		
		double resultX = (start_point_x2 - start_point_x1);
		double resultY = (end_point_y2 - end_point_y1);
		
		double result_pow_x = Math.pow(resultX,2);
		double result_pow_y = Math.pow(resultY,2);
		
		double result_plus = result_pow_x + result_pow_y;
		
		result = Math.sqrt(result_plus);
		
		return result;
	}





	
	
	
}
