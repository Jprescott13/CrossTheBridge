package PersonalProjects;

public class PlayGame {
	

	public static void main(String[] args) {
		FullDeck gameDeck = new FullDeck();
		
		
		System.out.println("***Clean Deck***");
		System.out.println(gameDeck.displayUnshuffledDeck());
		
		gameDeck.shuffleDeck();
		
		System.out.println("***Shuffled Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getUnopenedDeck()));

		gameDeck.dealCards(3);
		System.out.println("***Player 1's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerOne()));
		System.out.println(gameDeck.getHandPlayerOne().size());
		
		System.out.println("***Player 2's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerTwo()));
		System.out.println(gameDeck.getHandPlayerTwo().size());
		
		System.out.println("***Player 3's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerThree()));
		System.out.println(gameDeck.getHandPlayerThree().size());
		
		System.out.println("***Player 4's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerFour()));
		System.out.println(gameDeck.getHandPlayerFour().size());
		System.out.println("TESTING");
		
		
		
	}

}
