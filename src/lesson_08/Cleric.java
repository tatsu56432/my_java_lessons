package lesson_08;
import java.util.Random;

public class Cleric {

	int hp = 50;
	final int max_hp = 50;
	int mp = 10;
	final int max_mp = 10;
	
	void selfAid() {
		this.mp -=5;
		this.hp = max_hp;
	}	
	
	void pray(int sec){
		Random rand = new Random();
		int randNum = rand.nextInt(2) + 1;
		
		this.mp += sec + randNum;
		
		if(this.mp > max_mp) {
			this.mp = max_mp;
		}
		
		
		
	}
}
