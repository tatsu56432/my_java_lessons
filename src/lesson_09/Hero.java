package lesson_09;

public class Hero {
	

	String name;
	int hp;
	Sward sward;
	
	static int money;//静的フィールド　勇者パーティーのお金は勇者ごとに所持する必要はないので、フィールド宣言の先頭にstaticをつける、勇者パーティーで共有するフィールドを作成する。
	
	void attack() {
		System.out.println(this.name + "は攻撃した!");
		System.out.println("敵に5ポイントはのダメージを与えた!");
	}
	
	void run() {
		System.out.println(this.name + "縺ｯ騾�縺貞�ｺ縺励◆�ｼ�");
		System.out.println("GameOver");
		System.out.println("譛�邨�HP" + this.hp + "縺ｧ縺励◆縲�");
	}
	
	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + ",縺ｯ" + sec +  "遘貞ｺｧ縺｣縺滂ｼ�");
		System.out.println("HP縺�" + sec +  "繝昴う繝ｳ繝亥屓蠕ｩ縺励◆縲�");
	}
	
	void slip(){
		this.hp -=5;
		System.out.println(this.name + "縺ｯ縲∬ｻ｢繧薙□�ｼ�");
		System.out.println("5縺ｮ繝�繝｡繝ｼ繧ｸ!!!");		
	}
	
	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "縺ｯ縲∫悛縺｣縺ｦ縺励∪縺｣縺溘��");
	}

	//コンストラクタ　メソッド名がclass名と完全に同じ必要がある。メソッド宣言に戻り値が設定されていない(voidもダメ)
	//一番最後に書かないとダメ???
	Hero(String name){
		this.hp = 100;
		this.name = name;
	}
	Hero(){
		this("dummy");//コンストラクタHeroを呼び出す　　this.hp = 100;などの初期値の重複をさけるため
		this.name = "ダミーネーム";
	}
	
	//勇者たちの所持金をランダムに設定する
	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		
	}
	
}
