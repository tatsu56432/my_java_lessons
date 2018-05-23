package lesson_09;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hero h = new Hero("たつお");
		System.out.println(h.name);
        Hero h2 = new Hero();
        System.out.println(h2.hp);
        
        Hero.setRandomMoney();
        System.out.println(Hero.money);
        
        h.money = 100;
        h2.money = 500;
        System.out.println(Hero.money);
	
		/*　　//swardclassで用意されたfieldのswardをclass型swardフィールドとしてheroclassで用意しておくと、下記のような書き方で「勇者の剣の名前」という意味に「has a」の関係
		 * 
		Sward s = new Sward();
		s.name = "炎の剣";
		s.damage = 10;
		
		Hero h1 = new Hero();
		h1.name = "たつお";
		h1.hp = 100;
		h1.sward = s;
		
		System.out.println(h1.name + "の現在の武器は" + h1.sward.name + "!!");
		
		Hero h2 = new Hero();
		h2.name = "みなと";
		h2.hp = 100;
		
		Sward s2 = new Sward();
		s2.name = "氷の剣";
		h2.sward = s2;
		
		System.out.println(h2.name + "現在の武器は" + h2.sward.name + "!!");
		
		Wizard w = new Wizard();
		w.name = "魔法使いサラ";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		//ここでウィザードも回復したい場合どうするの??
		//w.heal(w);
		*/
		
	
//インスタントが一つだとh1とh2の変数のなかには同じインスタンスを経由して同じアドレスを参照することになるので、h1もh2も同じ数値200になるよっていうお話
//		Hero h1 = new Hero();
//		h1.name = "たつお";
//		h1.hp = 100;
//		Hero h2;
//		h2 = h1;
//		h2.hp = 200;
//		System.out.println(h1.hp);
//		System.out.println(h2.hp);
	

	}

}
