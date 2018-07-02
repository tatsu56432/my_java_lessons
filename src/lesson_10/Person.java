package lesson_10;

public class Person {

	// フィールドメンバ（属性）
	private String name; // 名前
	private int age; // 年齢
	private int energy; // エネルギー
	
	static int person_num = 0; // Personインスタンスの存在数


	

	// コンストラクタのオーバーロード（多重定義）
	// コンストラクタ：（引数なしのバージョン）
	Person() {
		// 引数が1つバージョンのコンストラクタの呼び出し
		this("コードキャンプ太郎");
	}

	// コンストラクタ：（引数が1つバージョン）
	Person(String name) {
		this.name = name;
		this.age = 30;
		this.energy = 30;
		person_num++;
	}

	// コンストラクタ：（引数が2つバージョン）
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.energy = 30;
		person_num++;
	}

	// コンストラクタ：（引数が3つバージョン）
	Person(String name, int age, int energy) {
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

	
	// アクセッサ
	// name のセッター、ゲッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	// age のセッター、ゲッター
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}
	
	

	
	
	//　energyのセッター、ゲッター
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
