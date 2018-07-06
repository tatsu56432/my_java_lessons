package lesson_10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main メソッドの中
	    // ひとまずPersonを誕生させる
	    Person person = new Person("コードキャンプ太郎");
	   
        int age = person.getAge();
        
        System.out.println(age);
	    
	   
	    
	    // フィールドメンバ energy に不正な値を代入する
	    //person.setEnergy(-10);
//	    person.showStatus();
	}

}
