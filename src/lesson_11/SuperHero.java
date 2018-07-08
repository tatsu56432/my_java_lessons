package lesson_11;

public class SuperHero extends Hero{
	String name;
	private boolean flying;
	
	
	public void attack(Matango m) {
		//superは親クラスを表す予約語
		super.attack(m);
		
//		System.out.println(this.name + "の攻撃！");
//		m.hp -= 5;
//		System.out.println("5ポイントのダメージを与えた！");
		if(this.flying) {
			super.attack(m);
//			System.out.println(this.name + "の攻撃！");
//			m.hp -= 5;
//			System.out.println("5ダメージを与えた！");
		}
	}
	
	
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	
	//オーバーライド
	public void run() {
		System.out.println("撤退した");
	}
	
	
}
