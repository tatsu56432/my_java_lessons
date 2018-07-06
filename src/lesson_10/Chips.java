package lesson_10;

public class Chips {
	
	private int num;
	 
	public Chips(int num) {
		this.num = num;
	}
	
	void change(int num) {
        this.num += num;
    }
	
	public void setChips(int num) {
		this.num = num;
	}
	
	public int getChips() {
		return num;
	}

}
