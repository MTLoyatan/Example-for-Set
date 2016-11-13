
public class DeckOfCardsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		 for( int i=0;i<13;i++)
		 {
			 System.out.printf("%-20s%-20s%-20s%-20s\n ",
					 myDeckOfCards.DealCard(), myDeckOfCards.DealCard(),
					 myDeckOfCards.DealCard(), myDeckOfCards.DealCard());
		 }

	}

}
