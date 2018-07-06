package lesson_09;

public class Person {
	
	String name;
	int age;
	int energy;
	static int person_num = 0;
	
	//コンストラクタ定義  複数定義する
	Person(){		
		this("コード太郎");
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
	
	 // コンストラクタ：（引数が3つバージョン）
	  Person(String name, int age, int energy){
	    this.name = name;
	    this.age = age;
	    this.energy = energy;
	    person_num++;
	  }
	 
	  
	  // メソッドメンバ（操作）
	  // 歩く
	  void walk() {
	    energy -= 30;
	  }
	 
	  // 食べる
	  void eat() {
	    energy += 30;
	  }
	 
	  // 眠る
	  void sleep() {
	    energy += 30;
	  }

	  
	  // ステータスを表示する
	  void showStatus() {
	    System.out.println("◆【名前】" + this.name);
	    System.out.println("◆【年齢】" + this.age);
	    System.out.println("◆【エネルギー】" + this.energy);
	  }

}
