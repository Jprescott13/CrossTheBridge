package PersonalProjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InGameDynamics {

	//private Set<PlayingCard> allCardsOnBoard = new HashSet<>();
	private Set<PlayingCard> allFlippedCards = new HashSet<>();
	private List<int[][]> leftPlayableLocations = new ArrayList<>();
	private List<int[][]> upPlayableLocations = new ArrayList<>();
	private List<int[][]> rightPlayableLocations = new ArrayList<>();
	private List<int[][]> downPlayableLocations = new ArrayList<>();
	private Set<int[][]> allPlayableLocations = new HashSet<>();
	private boolean arePlayersConnected = false;

	public InGameDynamics() {
		// TODO Auto-generated constructor stub
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
	
	public HashMap<String, PlayingCard> mapOfCurrentCards()

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

}
