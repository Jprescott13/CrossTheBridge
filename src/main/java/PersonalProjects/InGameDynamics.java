package PersonalProjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InGameDynamics {
	
	//*** This May need to be a Static Class***

	//private Set<PlayingCard> allCardsOnBoard = new HashSet<>();
	private Set<PlayingCard> allFlippedCards = new HashSet<>();
	private List<int[][]> leftPlayableLocations = new ArrayList<>();
	private List<int[][]> upPlayableLocations = new ArrayList<>();
	private List<int[][]> rightPlayableLocations = new ArrayList<>();
	private List<int[][]> downPlayableLocations = new ArrayList<>();
	private Set<int[][]> allPlayableLocations = new HashSet<>();
	private boolean arePlayersConnected = false;
	private HashMap<String, PlayingCard> cardsInGameByInGameLocation= new HashMap<>();
	private HashMap<String, PlayingCard> flippedCardsInGameByInGameLocation= new HashMap<>();

	public InGameDynamics() {
		// TODO Auto-generated constructor stub
	}
		
	public HashMap<String, PlayingCard> mapOfCurrentCards(Board gameBoard) {
		for (int currentRow = 0; currentRow < gameBoard.getRow(); currentRow++) {
			for (int currentColumn = 0; currentColumn < gameBoard.getCol(); currentColumn++){
				String rowAsString = String.valueOf(currentRow);
				String colAsString = String.valueOf(currentColumn);
				String rowColString = rowAsString + colAsString;
				cardsInGameByInGameLocation.put(rowColString, gameBoard.getSingleCardInPlayingCardMatrix(gameBoard.getFullMatrix(), currentRow, currentColumn));
			}
		}
		return cardsInGameByInGameLocation;
	}
	
	public void displayMapOfCurrentCards (HashMap <String, PlayingCard> mapToDisplay) {
		for( String keySet : mapToDisplay.keySet()) {
			System.out.println(keySet);
		}
	}
	
	public HashMap<String, PlayingCard> mapOfFlippedCurrentCards(Board gameBoard) {
		for (int currentRow = 0; currentRow < gameBoard.getRow(); currentRow++) {
			for (int currentColumn = 0; currentColumn < gameBoard.getCol(); currentColumn++){
				if (gameBoard.getSingleCardInPlayingCardMatrix(gameBoard.getFullMatrix(), currentRow, currentColumn).isFaceIsShowing()){
					String rowAsString = String.valueOf(currentRow);
					String colAsString = String.valueOf(currentColumn);
					String rowColString = rowAsString + colAsString;
					flippedCardsInGameByInGameLocation.put(rowColString, gameBoard.getSingleCardInPlayingCardMatrix(gameBoard.getFullMatrix(), currentRow, currentColumn));
				}
			}
		}
		return flippedCardsInGameByInGameLocation;
	}
	
	public void displayMapOfFlippedCurrentCards(HashMap <String, PlayingCard> mapToDisplay) {
		for( String keySet : mapToDisplay.keySet()) {
			System.out.println(keySet);
		}
	}
	
	public void flipPlayer1StartingCards(int row, int column) {
		String rowAsString = String.valueOf(row);
		String colAsString = String.valueOf(column);
		String rowColString = rowAsString + colAsString; 
		cardsInGameByInGameLocation.get(rowColString).setFaceIsShowing(true);
	}
	
	public void flipPlayer2StartingCards(int row, int column) {
		String rowAsString = String.valueOf(row);
		String colAsString = String.valueOf(column);
		String rowColString = rowAsString + colAsString; 
		cardsInGameByInGameLocation.get(rowColString).setFaceIsShowing(true); 
	}
	
	

	public Set<PlayingCard> getAllCardsOnBoard(Board gameBoard) {
		Set<PlayingCard> allCardsOnBoard = new HashSet<>();
		for (int currentRow = 0; currentRow < gameBoard.getRow(); currentRow++) {
			for (int currentColumn = 0; currentColumn < gameBoard.getCol(); currentColumn++){
				allCardsOnBoard.add(gameBoard.getSingleCardInPlayingCardMatrix(gameBoard.getFullMatrix(), currentRow, currentColumn));
			}
		}
		return allCardsOnBoard;
	}

//	public void setAllCardsOnBoard(Set<PlayingCard> allCardsOnBoard) {
//		this.allCardsOnBoard = allCardsOnBoard;
//	}

	public Set<PlayingCard> getAllFlippedCards() {
		return allFlippedCards;
	}

	public void setAllFlippedCards(Set<PlayingCard> allFlippedCards) {
		this.allFlippedCards = allFlippedCards;
	}

	public List<int[][]> getLeftPlayableLocations() {
		return leftPlayableLocations;
	}

	public void setLeftPlayableLocations(List<int[][]> leftPlayableLocations) {
		this.leftPlayableLocations = leftPlayableLocations;
	}

	public List<int[][]> getUpPlayableLocations() {
		return upPlayableLocations;
	}

	public void setUpPlayableLocations(List<int[][]> upPlayableLocations) {
		this.upPlayableLocations = upPlayableLocations;
	}

	public List<int[][]> getRightPlayableLocations() {
		return rightPlayableLocations;
	}

	public void setRightPlayableLocations(List<int[][]> rightPlayableLocations) {
		this.rightPlayableLocations = rightPlayableLocations;
	}

	public List<int[][]> getDownPlayableLocations() {
		return downPlayableLocations;
	}

	public void setDownPlayableLocations(List<int[][]> downPlayableLocations) {
		this.downPlayableLocations = downPlayableLocations;
	}

	public Set<int[][]> getAllPlayableLocations() {
		return allPlayableLocations;
	}

	public void setAllPlayableLocations(Set<int[][]> allPlayableLocations) {
		this.allPlayableLocations = allPlayableLocations;
	}

	public boolean isArePlayersConnected() {
		return arePlayersConnected;
	}

	public void setArePlayersConnected(boolean arePlayersConnected) {
		this.arePlayersConnected = arePlayersConnected;
	}

	public HashMap<String, PlayingCard> getCardsInGameByInGameLocation() {
		return cardsInGameByInGameLocation;
	}

	public void setCardsInGameByInGameLocation(HashMap<String, PlayingCard> cardsInGameByInGameLocation) {
		this.cardsInGameByInGameLocation = cardsInGameByInGameLocation;
	}

	public HashMap<String, PlayingCard> getFlippedCardsInGameByInGameLocation() {
		return flippedCardsInGameByInGameLocation;
	}

	public void setFlippedCardsInGameByInGameLocation(HashMap<String, PlayingCard> flippedCardsInGameByInGameLocation) {
		this.flippedCardsInGameByInGameLocation = flippedCardsInGameByInGameLocation;
	}

}
