package lesson_10;

public class Person {

	// �t�B�[���h�����o�i�����j
	private String name; // ���O
	private int age; // �N��
	private int energy; // �G�l���M�[
	
	static int person_num = 0; // Person�C���X�^���X�̑��ݐ�


	

	// �R���X�g���N�^�̃I�[�o�[���[�h�i���d��`�j
	// �R���X�g���N�^�F�i�����Ȃ��̃o�[�W�����j
	Person() {
		// ������1�o�[�W�����̃R���X�g���N�^�̌Ăяo��
		this("�R�[�h�L�����v���Y");
	}

	// �R���X�g���N�^�F�i������1�o�[�W�����j
	Person(String name) {
		this.name = name;
		this.age = 30;
		this.energy = 30;
		person_num++;
	}

	// �R���X�g���N�^�F�i������2�o�[�W�����j
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.energy = 30;
		person_num++;
	}

	// �R���X�g���N�^�F�i������3�o�[�W�����j
	Person(String name, int age, int energy) {
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

	
	// �A�N�Z�b�T
	// name �̃Z�b�^�[�A�Q�b�^�[
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	// age �̃Z�b�^�[�A�Q�b�^�[
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	
	

	
	
	//�@energy�̃Z�b�^�[�A�Q�b�^�[
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {

		if (0 <= energy) {
			this.energy = energy;
		} else {
			this.energy = 0;
		}

	}


}
