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
	private PlayingCard[][] fullMatrix;
	private int row;
	private int col;
	
	public Board(FullDeck deck, int row, int col){
		this.deck = deck.getUnopenedDeck();
		this.row = row;
		this.col = col;
	}
	private int randomLocation(){
		int location =  (int)(Math.random() * this.deck.size());
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
		voidLocation = new PlayingCard("none", "empty", 0, "E");
		voidLocation.setOutterDisplay("    EMPTY    ");
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				//add card from deck to location with randomly placed void card
				int location = randomLocation();
				if(this.deck.size() == 0){
					matrix[row][col] = voidLocation;
				}
				else if(location % 3 == 0){
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
	
	public void generateBoard(){
	//	this.fullMatrix = new PlayingCard[this.row*3][this.col*3];
		this.leftMatrix = createMatrix(this.row,this.col);
		this.leftMatrix = populateOuterMatrix(leftMatrix);
		this.rightMatrix = createMatrix(this.row,this.col);
		this.rightMatrix = populateOuterMatrix(rightMatrix);
		this.topMatrix = createMatrix(this.row,this.col);
		this.topMatrix = populateOuterMatrix(topMatrix);
		this.bottomMatrix = createMatrix(this.row,this.col);
		this.bottomMatrix =  populateOuterMatrix(bottomMatrix);
		this.centerMatrix = createMatrix(this.row,this.col);
		this.centerMatrix = populateCenterMatrix(centerMatrix);
	}
	

	private void displayEmptyMatrix(){
		PlayingCard[][] empty = new PlayingCard[this.row][this.col];
		for(row = 0; row < empty.length; row++){
			for(col=0; col < empty[0].length; col++){
				System.out.print("   ");
			}
			System.out.println();
		}
	}
	
	private void displayMatrix(PlayingCard [][] matrix){
		for(row = 0; row < matrix.length; row++){
			for(col=0; col < matrix[0].length; col++){
				System.out.print(matrix[row][col].getOutterDisplay() + " ");
			}
			System.out.println();
		}
	}
	
	public void displayBoard(){
		// top layer
		
		displayEmptyMatrix();
		displayMatrix(this.topMatrix);
		displayEmptyMatrix();		
		// middle layer
		displayMatrix(this.leftMatrix);
		displayMatrix(this.centerMatrix);
		displayMatrix(this.rightMatrix);
		
		//bottom layer
		displayEmptyMatrix();
		displayMatrix(this.bottomMatrix);
		displayEmptyMatrix();
	}
	
	//Getters for returning Matrixs
	public PlayingCard[][] getLeftMatrix() {
//		leftMatrix = createMatrix(this.row,this.col);
//		return populateOuterMatrix(leftMatrix);
		return this.leftMatrix;
	}

	public PlayingCard[][] getCenterMatrix() {
//		centerMatrix = createMatrix(this.row,this.col);
//		return populateCenterMatrix(centerMatrix);
		return this.centerMatrix;
	}

	public PlayingCard[][] getRightMatrix() {
//		rightMatrix = createMatrix(this.row,this.col);
//		return populateOuterMatrix(rightMatrix);
		return this.rightMatrix;
	}

	public PlayingCard[][] getTopMatrix() {
//		topMatrix = createMatrix(this.row,this.col);
//		return populateOuterMatrix(topMatrix);
		return this.topMatrix;
	}

	public PlayingCard[][] getBottomMatrix() {
//		bottomMatrix = createMatrix(this.row,this.col);
//		return populateOuterMatrix(bottomMatrix);
		return this.bottomMatrix;
	}
	
	
}
