package lesson_10;

public class Grade {
	
	private String name;
	private int score;
	private String result;
	
	//�R���X�g���N�^�̈����w�肵�Ȃ��ꍇ�ɃC���X�^���X�ł��Ȃ��悤�ɂ�����@�́H
	public Grade(String name,int score) {
		this.name = name;
		this.score = score;
	}
	
	void judge() {
		if(this.score>=90) {
			result = "AA";
		}else if(this.score>=80) {
			result = "A";			
		}else if(this.score>=70) {
			result = "B";
		}else if(this.score>=60){
			result = "C";
		}else {
			result = "�s��";
		}
	}
	

	public void setResult(int score) {
		this.judge();
	}
	
	public String getResult() {
		return result;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}
	
	public void setPoint(int score) {
		this.score = score;
	}
	
	public int getPoint() {
		return score;
	}

	

}
