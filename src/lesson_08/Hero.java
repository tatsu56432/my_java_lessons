package lesson_08;

public class Hero {
	

	String name;
	int hp;
	void attack() {
		
	}
	
	void run() {
		System.out.println(this.name + "は逃げ出した！");
		System.out.println("GameOver");
		System.out.println("最終HP" + this.hp + "でした。");
	}
	
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + ",は" + sec +  "秒座った！");
		System.out.println("HPが" + sec +  "ポイント回復した。");
	}
	
	void slip(){
		this.hp -=5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ!!!");		
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠ってしまった。");
	}
	

}
