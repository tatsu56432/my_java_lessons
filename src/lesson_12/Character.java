package lesson_12;

public abstract class Character {

	
	String name;
	int hp;
	
	
	public void run() {
		System.out.println(this.name + "�͓����o�����I");
	}
	
    
	
	//���ۃ��\�b�h
	public abstract void attack(Matango m);
	
}
