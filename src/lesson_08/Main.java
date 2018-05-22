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

		// 冒険の始まり
		Cleric c = new Cleric();
		c.name = "クレア";
		
		System.out.println(c.name + "は10ダメージを受けた！");
		c.hp -= 10;
		System.out.println(c.name + "のHPは" + c.hp);
		
		c.selfAid();
		int recovery_acutual_point = c.pray(2);
		System.out.println(c.name + "は" + recovery_acutual_point + "回復した！");

		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
