package lesson_09;

public class Person {
	
	String name;
	int age;
	int energy;
	static int person_num = 0;
	
	//�R���X�g���N�^��`  ������`����
	Person(){		
		this("�R�[�h���Y");
	}
	
	
	Person(String name){
		this.name = name;
		this.age = 30;
		this.energy = 30;
		person_num++;
	}
	
	Person(String name, int age){
	    this.name = name;
	    this.age = age;
	    this.energy = 30;
	    person_num++;
	  }
	
	 // �R���X�g���N�^�F�i������3�o�[�W�����j
	  Person(String name, int age, int energy){
	    this.name = name;
	    this.age = age;
	    this.energy = energy;
	    person_num++;
	  }
	 
	  
	  // ���\�b�h�����o�i����j
	  // ����
	  void walk() {
	    energy -= 30;
	  }
	 
	  // �H�ׂ�
	  void eat() {
	    energy += 30;
	  }
	 
	  // ����
	  void sleep() {
	    energy += 30;
	  }

	  
	  // �X�e�[�^�X��\������
	  void showStatus() {
	    System.out.println("���y���O�z" + this.name);
	    System.out.println("���y�N��z" + this.age);
	    System.out.println("���y�G�l���M�[�z" + this.energy);
	  }

}
