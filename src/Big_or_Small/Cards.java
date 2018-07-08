package Big_or_Small;

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
		int[] card_num = getNum();
		String[] card_mark = getMark();
		System.out.println("カードの種類" + card_mark[2] +card_num[0] +"" );
	}

	@Override
	public boolean decide() {
		// TODO Auto-generated method stub
		return false;
	}

}
