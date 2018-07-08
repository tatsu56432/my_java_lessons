package lesson_12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("図形を描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ]");
		System.out.println("描画したい図形を数値で選択してください。");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int incnt = scanner.nextInt();
		
		Figure figure;		
		if (incnt == 0) {
			figure = new Circle(100, 100, 20);
		} else if (incnt == 2) {
			figure = new Line(0, 0, 100, 100);
		} else if (incnt == 3) {
			figure = new Triangle(0, 0, 100, 100, 0, 200);
		} else if (incnt == 4) {
			figure = new Rectangle(0,0,100,100);
		} else if (incnt == 44) {
			figure = new Square(0,0,200);
		} else {
			System.out.println("指定の数値を入力してください。");
			return;
		}


		figure.draw();
		double length = figure.perimeter();
		System.out.println("周囲の長さは" + length);
		if(figure instanceof Polygon) {
			Polygon figure_re = (Polygon)figure;
			System.out.println("内角の和は"+ figure_re.getInternalAngel() +"です。");
			
		}
		

		
		

	}

}
