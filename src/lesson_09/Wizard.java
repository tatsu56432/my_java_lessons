package lesson_09;

public class Wizard {

	String name;
	int hp;
	
	void heal(Hero h) {
		h.hp = 10;
		System.out.println(this.name + "��" + h.name + "��HP��10�񕜂���!");
	}
	
}