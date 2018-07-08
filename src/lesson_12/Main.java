package lesson_12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("図形を描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ]");
		System.out.println("描画したい図形を数値で選択してください。");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int incnt = scanner.nextInt();
		
		if (incnt == 0) {
			Circle c = new Circle(100, 100, 20);
			c.draw();
			double length = c.perimeter();
			System.out.println("周囲の長さは" + length);
		} else if (incnt == 2) {
			Line l = new Line(0, 0, 100, 100);
			l.draw();
			double length = l.perimeter();
			System.out.println("周囲の長さは" + length);
		} else if (incnt == 3) {
			Triangle t = new Triangle(0, 0, 100, 100, 0, 200);
			t.draw();
			double length = t.perimeter();
			System.out.println("周囲の長さは" + length);
			System.out.println("内角の和は"+ t.getInternalAngel() +"です。");
			
		} else if (incnt == 4) {
			Rectangle r = new Rectangle(0,0,100,100);
			r.draw();
			double length = r.perimeter();
			System.out.println("周囲の長さは" + length);
			System.out.println("内角の和は"+ r.getInternalAngel() +"です。");
		} else if (incnt == 44) {
			Square s = new Square(0,0,200);
			s.draw();
			double length = s.perimeter();
			System.out.println("周囲の長さは" + length);
			System.out.println("内角の和は"+ s.getInternalAngel() +"です。");
		} else {
			System.out.println("指定の数値を入力してください。");
		}

	}

}
