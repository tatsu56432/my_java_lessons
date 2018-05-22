package lesson_08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h = new Hero();
		h.name = "たつお";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';

		Matango m2 = new Matango();
		m2.hp = 50;
		m2.suffix = 'B';
		
		//冒険の始まり
		h.slip();
		m1.run();
		m2.run();

		h.run();
	}

}
