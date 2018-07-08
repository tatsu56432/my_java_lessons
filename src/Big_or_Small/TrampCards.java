package Big_or_Small;

public class TrampCards extends Cards {
	
	private int[] cardsDeck;
	private Cards cards;
	

	public int[] getCardsDeck() {
		return cardsDeck;
	}
	
	public Cards getCards() {
		return this.cards;
	}

	public void setCardsDeck(int[] cardsDeck) {
		String card = cards.display();
		
		this.cardsDeck = cardsDeck;
	}

	public TrampCards() {
		this.cards = new Cards();
		this.cardsDeck = new int[52];
	}
	
	
}
