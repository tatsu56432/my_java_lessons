package lesson_09;
import java.util.Random;

public class Cleric {
    String name;
	int hp = 50;
	int mp = 10;
	static final int max_hp = 100;		
	static final int max_mp = 10;		
	
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


	Cleric(String name ,int hp ,int mp){    	
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	Cleric(String name ,int hp){
	 this(name,hp,Cleric.max_mp);
	}
	
    Cleric(String name){
    	this(name,Cleric.max_hp,Cleric.max_mp);    	
	}

	
	
}
