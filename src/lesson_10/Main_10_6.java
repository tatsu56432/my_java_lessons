package lesson_10;

public class Main_10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chips chips = new Chips(100);
	 
        // チップを10増やす
        chips.change(10);
        
        // 現在のチップ数を表示       
        int chips_num = chips.getChips();        
        System.out.println(chips_num);
		
		
		
	}

}
