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
		
		
		//Testing the Comparing Card fuctionality.
		
		System.out.println("TESTING");
		
		//ComparingCards.compareValue(gameDeck.getShuffledDeck().get(1), gameDeck.getShuffledDeck().get(2));
		System.out.println("Card 1: " + gameDeck.getShuffledDeck().get(1).getShortName());
		System.out.println("Card 2: " + gameDeck.getShuffledDeck().get(2).getShortName());
		System.out.println("T/F: Card 2 is higher than Card 1? ");
		System.out.println(ComparingCards.isHigher());
		
		if(gameDeck.getHandPlayerOne().get(1).compareCardValue(gameDeck.getHandPlayerTwo().get(1)) == 1) {
			System.out.println("Card 1: " + gameDeck.getHandPlayerOne().get(1).getShortName());
			System.out.println(" is higher than Card 2: " + gameDeck.getHandPlayerTwo().get(1).getShortName());
		} else if (gameDeck.getHandPlayerOne().get(1).compareCardValue(gameDeck.getHandPlayerTwo().get(1)) == 0) {
			System.out.println("Card 1: " + gameDeck.getHandPlayerOne().get(1).getShortName());
			System.out.println(" has an equal value to Card 2: " + gameDeck.getHandPlayerTwo().get(1).getShortName());
		} else if (gameDeck.getHandPlayerOne().get(1).compareCardValue(gameDeck.getHandPlayerTwo().get(1)) == -1) {
			System.out.println("Card 1: " + gameDeck.getHandPlayerOne().get(1).getShortName());
			System.out.println(" is lower than Card 2: " + gameDeck.getHandPlayerTwo().get(1).getShortName());
		}
		
		System.out.println("**************" );
		System.out.println("Higher / Lower Test" );
		if(gameDeck.getHandPlayerOne().get(1).compareCardValue(gameDeck.getHandPlayerOne().get(2)) == 1){
			
		}
		
		
		gameDeck.getHandPlayerOne().get(1).getColor();
		System.out.println("**************" );
		System.out.println("Compare Color Test" );	
		System.out.println("Your Guess was: Black");
		System.out.println("The Card was: " + gameDeck.getHandPlayerOne().get(1).getShortName());
		System.out.println("The Card's Color was: " + gameDeck.getHandPlayerOne().get(1).getColor());
		if(gameDeck.getHandPlayerOne().get(1).compareCardColor("Black") == 1){
			System.out.println("You Were Correct");
		}else if (gameDeck.getHandPlayerOne().get(1).compareCardColor("Black") == -1){
			System.out.println("You Were Incorrect");
		}else {
			System.out.println("We Have an Issue");
		}
		
		
		System.out.println("**************" );
		System.out.println("Odd Even or Face Test" );
		System.out.println("Your Guess was: Odd" );
		System.out.println("The Card was: " + gameDeck.getHandPlayerOne().get(1).getShortName());
		if (gameDeck.getHandPlayerOne().get(1).compareOddEvenOrFace("Odd") == 1){
			System.out.println("You Were Correct");
		}else if (gameDeck.getHandPlayerOne().get(1).compareOddEvenOrFace("Odd") == -1){
			System.out.println("You Were Incorrect");
		}else {
			System.out.println("We Have an Issue");
		}
	}
		
	

}
