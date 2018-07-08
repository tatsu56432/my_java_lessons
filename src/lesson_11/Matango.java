package lesson_11;

public class Matango {
	
	int hp = 50;
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public char getSuffix() {
		return suffix;
	}

	public void setSuffix(char suffix) {
		this.suffix = suffix;
	}

	private char suffix;
	final int level = 10;
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp()-10);
	}
}
