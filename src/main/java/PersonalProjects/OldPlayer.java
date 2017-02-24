package PersonalProjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OldPlayer {
//	private String player1Name;
//	private String player2Name;
//	private int[][] player1StartingLocation;
//	private int player1StartingRow;
//	private int player1StartingColumn;
//	private int player2StartingRow;
//	private int player2StartingColumn;
//	private int[][] player2StartingLocation;
//	private List<int[][]> player1LeftPlayableLocations = new ArrayList<>();
//	private List<int[][]> player1UpPlayableLocations = new ArrayList<>();
//	private List<int[][]> player1DownPlayableLocations = new ArrayList<>();
//	private List<int[][]> player1RightPlayableLocations= new ArrayList<>();
//	private List<int[][]> player1AllPlayableLocations;	
//	private List<int[][]> player2LeftPlayableLocations = new ArrayList<>();
//	private List<int[][]> player2UpPlayableLocations = new ArrayList<>();
//	private List<int[][]> player2DownPlayableLocations = new ArrayList<>();
//	private List<int[][]> player2RightPlayableLocations= new ArrayList<>();
//	private List<int[][]> player2AllPlayableLocations;
	
	private int playerNumber;
	private String playerName;
	private int playerStartingRow;
	private int playerStartingColumn;
	private List<int[][]> leftPlayableLocations = new ArrayList<>();
	private List<int[][]> upPlayableLocations = new ArrayList<>();
	private List<int[][]> rightPlayableLocations = new ArrayList<>();
	private List<int[][]> downPlayableLocations = new ArrayList<>();
	private Set<int[][]> allflippedCards = new HashSet<>();
	private boolean arePlayersConnected = false;
	private boolean player1sTurn = true;

	public OldPlayer(int playersNumber, String name, int startingRow, int startingColumn) {
		this.playerNumber = playersNumber;
		this.playerName = name;
		this.playerStartingRow = startingRow;
		this.playerStartingColumn = startingColumn;
	}
	
	
	

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerStartingRow() {
		return playerStartingRow;
	}

	public void setPlayerStartingRow(int playerStartingRow) {
		this.playerStartingRow = playerStartingRow;
	}

	public int getPlayerStartingColumn() {
		return playerStartingColumn;
	}

	public void setPlayerStartingColumn(int playerStartingColumn) {
		this.playerStartingColumn = playerStartingColumn;
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

	public boolean isArePlayersConnected() {
		return arePlayersConnected;
	}

	public void setArePlayersConnected(boolean arePlayersConnected) {
		this.arePlayersConnected = arePlayersConnected;
	}

	public boolean isPlayer1sTurn() {
		return player1sTurn;
	}

	public void setPlayer1sTurn(boolean player1sTurn) {
		this.player1sTurn = player1sTurn;
	}





	public Set<int[][]> getAllflippedCards() {
		return allflippedCards;
	}





	public void setAllflippedCards(Set<int[][]> allflippedCards) {
		this.allflippedCards = allflippedCards;
	}

}