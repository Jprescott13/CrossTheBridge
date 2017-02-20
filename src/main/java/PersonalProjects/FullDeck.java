package PersonalProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FullDeck {
	private List<PlayingCard> unopenedDeck = new ArrayList<>();
	private List<PlayingCard> shuffledDeck = new ArrayList<>(); 
	private List<PlayingCard> handPlayerOne = new ArrayList<>();
	private List<PlayingCard> handPlayerTwo = new ArrayList<>();
	private List<PlayingCard> handPlayerThree = new ArrayList<>();
	private List<PlayingCard> handPlayerFour = new ArrayList<>();

	public FullDeck() {
		//Diamonds
		unopenedDeck.add(new PlayingCard("Diamonds", "Two", 2, "D2"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Three", 3, "D3"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Four", 4, "D4"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Five", 5, "D5"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Six", 6, "D6"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Seven", 7, "D7"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Eight", 8, "D8"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Nine", 9, "D9"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Ten", 10, "D10"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Jack", 11, "DJ"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Queen", 12, "DQ"));
		unopenedDeck.add(new PlayingCard("Diamonds", "King", 13, "DK"));
		unopenedDeck.add(new PlayingCard("Diamonds", "Ace", 14, "DA"));
		//Hearts
		unopenedDeck.add(new PlayingCard("Hearts", "Two", 2, "H2"));
		unopenedDeck.add(new PlayingCard("Hearts", "Three", 3, "H3"));
		unopenedDeck.add(new PlayingCard("Hearts", "Four", 4, "H4"));
		unopenedDeck.add(new PlayingCard("Hearts", "Five", 5, "H5"));
		unopenedDeck.add(new PlayingCard("Hearts", "Six", 6, "H6"));
		unopenedDeck.add(new PlayingCard("Hearts", "Seven", 7, "H7"));
		unopenedDeck.add(new PlayingCard("Hearts", "Eight", 8, "H8"));
		unopenedDeck.add(new PlayingCard("Hearts", "Nine", 9, "H9"));
		unopenedDeck.add(new PlayingCard("Hearts", "Ten", 10, "H10"));
		unopenedDeck.add(new PlayingCard("Hearts", "Jack", 11, "HJ"));
		unopenedDeck.add(new PlayingCard("Hearts", "Queen", 12, "HQ"));
		unopenedDeck.add(new PlayingCard("Hearts", "King", 13, "HK"));
		unopenedDeck.add(new PlayingCard("Hearts", "Ace", 14, "HA"));
		//Clubs
		unopenedDeck.add(new PlayingCard("Clubs", "Two", 2, "C2"));
		unopenedDeck.add(new PlayingCard("Clubs", "Three", 3, "C3"));
		unopenedDeck.add(new PlayingCard("Clubs", "Four", 4, "C4"));
		unopenedDeck.add(new PlayingCard("Clubs", "Five", 5, "C5"));
		unopenedDeck.add(new PlayingCard("Clubs", "Six", 6, "C6"));
		unopenedDeck.add(new PlayingCard("Clubs", "Seven", 7, "C7"));
		unopenedDeck.add(new PlayingCard("Clubs", "Eight", 8, "C8"));
		unopenedDeck.add(new PlayingCard("Clubs", "Nine", 9, "C9"));
		unopenedDeck.add(new PlayingCard("Clubs", "Ten", 10, "C10"));
		unopenedDeck.add(new PlayingCard("Clubs", "Jack", 11, "CJ"));
		unopenedDeck.add(new PlayingCard("Clubs", "Queen", 12, "CQ"));
		unopenedDeck.add(new PlayingCard("Clubs", "King", 13, "CK"));
		unopenedDeck.add(new PlayingCard("Clubs", "Ace", 14, "CA"));
		//Spades
		unopenedDeck.add(new PlayingCard("Spades", "Two", 2, "C2"));
		unopenedDeck.add(new PlayingCard("Spades", "Three", 3, "C3"));
		unopenedDeck.add(new PlayingCard("Spades", "Four", 4, "C4"));
		unopenedDeck.add(new PlayingCard("Spades", "Five", 5, "C5"));
		unopenedDeck.add(new PlayingCard("Spades", "Six", 6, "S6"));
		unopenedDeck.add(new PlayingCard("Spades", "Seven", 7, "S7"));
		unopenedDeck.add(new PlayingCard("Spades", "Eight", 8, "S8"));
		unopenedDeck.add(new PlayingCard("Spades", "Nine", 9, "S9"));
		unopenedDeck.add(new PlayingCard("Spades", "Ten", 10, "S10"));
		unopenedDeck.add(new PlayingCard("Spades", "Jack", 11, "SJ"));
		unopenedDeck.add(new PlayingCard("Spades", "Queen", 12, "SQ"));
		unopenedDeck.add(new PlayingCard("Spades", "King", 13, "SK"));
		unopenedDeck.add(new PlayingCard("Spades", "Ace", 14, "SA"));
	
	}
	
	
	public List<PlayingCard> shuffleDeck() {
		shuffledDeck = unopenedDeck;
		Collections.shuffle(shuffledDeck);
		return shuffledDeck;
	}
	
	
	
	public List<String> displayUnshuffledDeck() {
		List<String> cardsInOrder = new ArrayList<>();
		int cardCount = unopenedDeck.size();
		for (int i = 0; i < cardCount; i++) {
			PlayingCard c = unopenedDeck.get(i);
			cardsInOrder.add(i, c.getName()+" of " + c.getSuit() + System.lineSeparator() );	
		}
		return cardsInOrder;
	}

	public List<String> displayShuffledDeck(List<PlayingCard> inputDeck) {
		List<String> cardsThatShouldBeShuffled = new ArrayList<>();
		int cardCount = inputDeck.size();
		for (int i = 0; i < cardCount; i++) {
			PlayingCard c = inputDeck.get(i);
			cardsThatShouldBeShuffled.add(i, c.getName()+" of " + c.getSuit() + System.lineSeparator() );	
		}
		Collections.shuffle(cardsThatShouldBeShuffled);
		return cardsThatShouldBeShuffled;
	}
	
	public void dealCards(int numberOfPlayers) {
		int handsToBeDelt = numberOfPlayers;
		int cardCount = unopenedDeck.size();
		
		for (int i = 0; i<=cardCount; i += handsToBeDelt) {
			if (i<cardCount && handsToBeDelt >= 1){
				handPlayerOne.add(shuffledDeck.get(i));
			}
			if (i+1 < cardCount && handsToBeDelt >= 2){
				handPlayerTwo.add(shuffledDeck.get(i+1));
			}
			if (i+2 <cardCount && handsToBeDelt >= 3){
				handPlayerThree.add(shuffledDeck.get(i+2));
			}
			if (i+3 <cardCount && handsToBeDelt >= 4) {
				handPlayerFour.add(shuffledDeck.get(i+3));
			}
		}
			

//		for (int j = cardCount-1; j >=0; j--) {
//			if (handsToBeDelt >= 4 && j>0) {
//				handPlayerFour.add(shuffledDeck.get(j));
//				j -= 1;
//			}if (handsToBeDelt >= 3 && j>0) {
//				handPlayerThree.add(shuffledDeck.get(j));
//				j -= 1;
//			}if (handsToBeDelt >= 2 && j>0) {
//				handPlayerTwo.add(shuffledDeck.get(j));
//				j -= 1;
//			}if (handsToBeDelt >= 1 && j>0) {
//				handPlayerOne.add(shuffledDeck.get(j));
//				j -= 1;
//			}	
////			if (j % 4 == 0 && handsToBeDelt >= 4) {
//				handPlayerFour.add(shuffledDeck.get(j-1));
//				
//			} else if (j % 3 == 0 && handsToBeDelt >= 3) {
//				handPlayerThree.add(shuffledDeck.get(j-1));
//			
//			} else if (j % 2 == 0 && handsToBeDelt >= 2) {
//				handPlayerTwo.add(shuffledDeck.get(j-1));
//			
//			} else {
//				handPlayerOne.add(shuffledDeck.get(j-1));
//			}
		
	}


	public List<PlayingCard> getUnopenedDeck() {
		return unopenedDeck;
	}


	public void setUnopenedDeck(List<PlayingCard> unopenedDeck) {
		this.unopenedDeck = unopenedDeck;
	}


	public List<PlayingCard> getShuffledDeck() {
		return shuffledDeck;
	}


	public void setShuffledDeck(List<PlayingCard> shuffledDeck) {
		this.shuffledDeck = shuffledDeck;
	}


	public List<PlayingCard> getHandPlayerOne() {
		return handPlayerOne;
	}


	public void setHandPlayerOne(List<PlayingCard> handPlayerOne) {
		this.handPlayerOne = handPlayerOne;
	}


	public List<PlayingCard> getHandPlayerTwo() {
		return handPlayerTwo;
	}


	public void setHandPlayerTwo(List<PlayingCard> handPlayerTwo) {
		this.handPlayerTwo = handPlayerTwo;
	}


	public List<PlayingCard> getHandPlayerThree() {
		return handPlayerThree;
	}


	public void setHandPlayerThree(List<PlayingCard> handPlayerThree) {
		this.handPlayerThree = handPlayerThree;
	}


	public List<PlayingCard> getHandPlayerFour() {
		return handPlayerFour;
	}


	public void setHandPlayerFour(List<PlayingCard> handPlayerFour) {
		this.handPlayerFour = handPlayerFour;
	}

	//Shuffles and Displays a HashMap
//	public List<String> displayShuffledDeck() {
//		
//		List<String> DeckListCards = new ArrayList<>();
//		Set<String> keys = shuffledDeck.keySet();
//		
//		for (String s: keys) {
//			PlayingCard c = shuffledDeck.get(s);
//			StringBuffer itemString = new StringBuffer();
//			
//			itemString.append(c.getName() + " of " + c.getSuit());
//			itemString.append(System.lineSeparator());
//			DeckListCards.add(itemString.toString());
//		}
//		Collections.shuffle(DeckListCards);
//		return DeckListCards;
//	}
	
}
