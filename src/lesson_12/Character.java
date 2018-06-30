package lesson_12;

public abstract class Character {

	
	String name;
	int hp;
	
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	
    
	
	//抽象メソッド
	public abstract void attack(Matango m);
	
}
