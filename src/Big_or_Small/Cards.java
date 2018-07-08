package Big_or_Small;

import java.util.Random;

public class Cards implements Game{

	private MarkAndNum MarkAndNum_obj;
	private int[] num;
	private String[] mark;
	
	public MarkAndNum getMarkAndNum_obj() {
		return this.MarkAndNum_obj;
	}

	public int[] getNum() {
		return this.num;
	}

	public String[] getMark() {
		return mark;
	}
	
	public Cards() {
		this.MarkAndNum_obj = new MarkAndNum();
		this.num = MarkAndNum_obj.getNum();
		this.mark = MarkAndNum_obj.getMark();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		//乱数を生成
		Random rand = new Random();
		int randomNum_mark = rand.nextInt(4);
		int randomNum = rand.nextInt(14);
		
		while(randomNum < 1) {
			randomNum = rand.nextInt(14);			
		}
		
		
		int[] card_num = getNum();
		String[] card_mark = getMark();
		System.out.println("カードの種類は" + card_mark[randomNum_mark] +card_num[randomNum]);
		
	}

	@Override
	public boolean decide() {
		// TODO Auto-generated method stub
		return false;
	}

}
