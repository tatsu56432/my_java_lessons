package lesson_11;

public class Hero {
	
	private String name = "みなと";
	private int hp = 100;
	
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "はころんだ！");
	}
	
	public void attack(Matango m) {
		System.out.println("5ポイントのだめーじをあたえた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

}
