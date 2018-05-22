package lesson_08;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h = new Hero();
		
		h.name = "たつお";
		h.hp = 100;
		
		System.out.println("勇者" + h.name + "を生み出しました!");
		
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();

	}

}
