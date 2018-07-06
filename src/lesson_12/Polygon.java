package lesson_12;

public abstract class Polygon extends Shape {
	
	
	protected int angel;
	
	
//	public int getAngel() {
//		return this.angel;
//	}

	public abstract void draw();
	 
	 public abstract double perimeter();
	 
	 public int getInternalAngel() {
		
		 int result;
		 
		 int angel = this.angel;
		 
		 result = (angel - 3 + 1) * 180;
		 
		 return result;
	 };
	
}
