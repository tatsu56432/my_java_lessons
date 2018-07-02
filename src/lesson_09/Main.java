package lesson_09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h = new Hero("����");
		System.out.println(h.name);
        Hero h2 = new Hero();
        System.out.println(h2.hp);
        
        Hero.setRandomMoney();
        System.out.println(Hero.money);
        
        h.money = 100;
        h2.money = 500;
        System.out.println(Hero.money);
	
		/*�@�@//swardclass�ŗp�ӂ��ꂽfield��sward��class�^sward�t�B�[���h�Ƃ���heroclass�ŗp�ӂ��Ă����ƁA���L�̂悤�ȏ������Łu�E�҂̌��̖��O�v�Ƃ����Ӗ��Ɂuhas a�v�̊֌W
		 * 
		Sward s = new Sward();
		s.name = "���̌�";
		s.damage = 10;
		
		Hero h1 = new Hero();
		h1.name = "����";
		h1.hp = 100;
		h1.sward = s;
		
		System.out.println(h1.name + "�̌��݂̕����" + h1.sward.name + "!!");
		
		Hero h2 = new Hero();
		h2.name = "�݂Ȃ�";
		h2.hp = 100;
		
		Sward s2 = new Sward();
		s2.name = "�X�̌�";
		h2.sward = s2;
		
		System.out.println(h2.name + "���݂̕����" + h2.sward.name + "!!");
		
		Wizard w = new Wizard();
		w.name = "���@�g���T��";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		//�����ŃE�B�U�[�h���񕜂������ꍇ�ǂ������??
		//w.heal(w);
		*/
		
	
//�C���X�^���g�������h1��h2�̕ϐ��̂Ȃ��ɂ͓����C���X�^���X���o�R���ē����A�h���X���Q�Ƃ��邱�ƂɂȂ�̂ŁAh1��h2���������l200�ɂȂ����Ă������b
//		Hero h1 = new Hero();
//		h1.name = "����";
//		h1.hp = 100;
//		Hero h2;
//		h2 = h1;
//		h2.hp = 200;
//		System.out.println(h1.hp);
//		System.out.println(h2.hp);
	

	}

}
