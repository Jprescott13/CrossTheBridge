package PersonalProjects;

import java.util.HashSet;
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
	private boolean player1sTurn = true;
	private Set<int[][]> playersPlayableLocations = new HashSet<>();

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

	public boolean isPlayer1sTurn() {
		return player1sTurn;
	}

	public void setPlayer1sTurn(boolean player1sTurn) {
		this.player1sTurn = player1sTurn;
	}

	public Set<int[][]> getPlayersPlayableLocations() {
		return playersPlayableLocations;
	}

	public void setPlayersPlayableLocations(Set<int[][]> playersPlayableLocations) {
		this.playersPlayableLocations = playersPlayableLocations;
	}

}