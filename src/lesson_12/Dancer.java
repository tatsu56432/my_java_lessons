package lesson_12;

public abstract class Dancer extends Character{

	
	public void dance() {
	System.out.println(this.name + "�͏�M�I�ɗx�����I");	
	}
	
	
	public void attack(Matango m) {
		System.out.println(this.name + "�̍U��!");
		System.out.println("�G��3�|�C���g�̃_���[�W!!");
		m.hp-= 3;		
	}
	
	
}
