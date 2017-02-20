package PersonalProjects;

import java.util.List;

public class Board {
	private List<PlayingCard> deck;
	private PlayingCard voidLocation;
	private PlayingCard[][] leftMatrix;
	private PlayingCard[][] centerMatrix;
	private PlayingCard[][] rightMatrix;
	private PlayingCard[][] topMatrix;
	private PlayingCard[][] bottomMatrix;
	
	public Board(FullDeck deck){
		this.deck = deck.getUnopenedDeck();
	}
	private int randomLocation(){
		int location =  (int)Math.random() * this.deck.size() + 1;
		 return location;
	}
	// creates a matrix, returns matrix of input size
	private PlayingCard[][] createMatrix(int row, int column){
		return new PlayingCard[row][column];
	}
	
	// populates given matrix from deck
	//removes card from deck after it is assigned
	private PlayingCard[][] populateOuterMatrix(PlayingCard[][] matrix){
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				//add card from deck to location
				int location = randomLocation();
				matrix[row][col] = this.deck.get(location);
				//need to remove set card from deck
				this.deck.remove(location);
			}
		}
		return matrix;
	}
	//center matrix has possible null locations where user cannot travel
	private PlayingCard[][] populateCenterMatrix(PlayingCard[][] matrix){
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				//add card from deck to location with randomly placed void card
				int location = randomLocation();
				if(location % 2 == 0){
					matrix[row][col] = voidLocation;
				}else{
					matrix[row][col] = this.deck.get(location);
					// need to remove placed card from deck
					this.deck.remove(location);
				}	
			}
		}
		return matrix;
	}
	
	//Getters for returning Matrixs
	public PlayingCard[][] getLeftMatrix() {
		leftMatrix = createMatrix(3,4);
		return populateOuterMatrix(leftMatrix);
	}

	public PlayingCard[][] getCenterMatrix() {
		centerMatrix = createMatrix(3,4);
		return populateCenterMatrix(centerMatrix);
	}

	public PlayingCard[][] getRightMatrix() {
		rightMatrix = createMatrix(3,4);
		return populateOuterMatrix(rightMatrix);
	}

	public PlayingCard[][] getTopMatrix() {
		topMatrix = createMatrix(3,4);
		return populateOuterMatrix(topMatrix);
	}

	public PlayingCard[][] getBottomMatrix() {
		bottomMatrix = createMatrix(3,4);
		return populateOuterMatrix(bottomMatrix);
	}
}
