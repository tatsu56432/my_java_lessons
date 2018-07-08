package Big_or_Small;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cards c = new Cards();
		int[] card_num = c.getCard_num();
		
		for (int num : card_num) {
		    System.out.println(num);
		}
		
//		int i;
//		for(i=0;i< card_num.length; i++) {
//			System.out.println(card_num[i]);
//		}
		
	}

}
