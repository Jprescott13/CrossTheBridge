package PersonalProjects;

public class PlayGame {
	
	public static void main(String[] args) {
		FullDeck gameDeck = new FullDeck();
		Board gameBoard = new Board(gameDeck, 3,4);
		OldPlayer player1 = new OldPlayer(1, "JP",5,0);
		OldPlayer player2 = new OldPlayer(2, "Robbie",3,8);
		InGameDynamics gamePlay = new InGameDynamics();

		System.out.println("***Clean / Unshuffled Deck***");
		System.out.println(" " );
		System.out.println(gameDeck.displayUnshuffledDeck());
		System.out.println(" " );
		
		gameDeck.shuffleDeck();
		
		System.out.println("***Shuffled Deck***");
		System.out.println(" " );
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getUnopenedDeck()));
		System.out.println(" " );
		
		gameDeck.dealCards(3);
		System.out.println("***Player 1's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerOne()));
		System.out.println(gameDeck.getHandPlayerOne().size());
		System.out.println(" " );
		
		System.out.println("***Player 2's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerTwo()));
		System.out.println(gameDeck.getHandPlayerTwo().size());
		System.out.println(" " );
		
		System.out.println("***Player 3's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerThree()));
		System.out.println(gameDeck.getHandPlayerThree().size());
		System.out.println(" " );
		
		System.out.println("***Player 4's Hand Deck***");
		System.out.println(gameDeck.displayShuffledDeck(gameDeck.getHandPlayerFour()));
		System.out.println(gameDeck.getHandPlayerFour().size());
		System.out.println(" " );
		
		
		//Testing the Comparing Card functionality.
		
		System.out.println("**************" );
		System.out.println("Card Comparison Testing Section");
		
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
		System.out.println(" " );
		System.out.println("Higher / Lower Test" );
		if(gameDeck.getHandPlayerOne().get(1).compareCardValue(gameDeck.getHandPlayerOne().get(2)) == 1){
			
		}
		
		
		gameDeck.getHandPlayerOne().get(1).getColor();
		System.out.println("**************" );
		System.out.println(" " );
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
		System.out.println(" " );
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
	
		System.out.println("**************" );
		System.out.println(" " );
		System.out.println(" " );
		System.out.println(" " );
		gameBoard.generateBoard();
		//gameBoard.displayBoardWithCardsShowing();
		System.out.println("Populating and displaying a series of small matrixes:");
		gameBoard.displayTopSectionOfFormattedMatrixWithCardsShowing();
		gameBoard.displayCenterSectionOfFormattedMatrixWithCardsShowing();
		gameBoard.displayBottomSectionOfFormattedMatrixWithCardsShowing();
		System.out.println(" " );
		System.out.println(" " );
		System.out.println(" " );
		
		
		
		System.out.println("**************" );
		System.out.println(" " );
		System.out.println(" " );
		System.out.println(" " );
		System.out.println("Populating and displaying one large matrix:");
		gameBoard.displayFullBoard();
		
		System.out.println("**************" );
		System.out.println(" " );
		System.out.println(" " );
		System.out.println(" " );
		System.out.println("Check if the Player's starting locations are valid locations:");
		if (gameBoard.getSingleCardInPlayingCardMatrix(gameBoard.getFullMatrix(), 
				player1.getPlayerStartingRow(), player1.getPlayerStartingColumn()).getShortName() != "XX") {
			System.out.println("Player 1's stating location is : [" + player1.getPlayerStartingRow() + "] [" 
				+ player1.getPlayerStartingColumn() + "] is a valid location");
		}else {
			System.out.println("Player 1's stating location is : [" + player1.getPlayerStartingColumn() + "] [" 
					+ player1.getPlayerStartingColumn() + "] is NOT a valid location");
		
		}
		if (gameBoard.getSingleCardInPlayingCardMatrix(gameBoard.getFullMatrix(), 
				player2.getPlayerStartingRow(), player2.getPlayerStartingColumn()).getShortName() != "XX") {
			System.out.println("Player 2's stating location is : [" + player2.getPlayerStartingRow() + "] [" 
					+ player2.getPlayerStartingColumn() + "] is a valid location");
		} else {
			System.out.println("Player 2's stating location is : [" + player2.getPlayerStartingRow() + "] [" 
					+ player2.getPlayerStartingColumn() + "] is NOT a valid location");
		}
	
		gamePlay.mapOfCurrentCards(gameBoard);
		gamePlay.displayMapOfCurrentCards(gamePlay.getCardsInGameByInGameLocation());
		
		
	}
	

}
