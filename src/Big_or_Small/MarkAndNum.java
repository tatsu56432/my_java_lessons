package Big_or_Small;

public class MarkAndNum {
	
	private String[] mark;
	private int[] num;
	
	public String[] getMark() {
		return this.mark;
	}	
	public int[] getNum() {
		return this.num; 
	}

	public MarkAndNum() {	
		this.mark = new String[4];
		this.mark[0] = "スペード";
		this.mark[1] = "ハート";
		this.mark[2] = "ダイヤ";
		this.mark[3] = "クラブ";

		this.num = new int[53];
		
		int i = 0;
		for (i = 0; i < 53; i++) {
			this.num[i] = i + 1;
		}
		
	}
}
