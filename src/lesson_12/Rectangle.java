package lesson_12;

public class Rectangle extends Polygon {

	
	protected Point p;
	protected int width;
	protected int height;
	
	
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
		//�e�N���X��angel��4����
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
		
		System.out.println("�l�p�`��`�� �_(" + start_point +","+ end_point + ")����Ƃ��āA��"+ width +"����"+ height +"�̎l�p�`");
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
