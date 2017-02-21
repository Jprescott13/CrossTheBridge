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
	private PlayingCard[][] nonPlayableMatrix;
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
	
	//populateEmptyMatrixWithEmptyCards
	private PlayingCard[][] populateNonPlayableMatrix(PlayingCard[][] matrix) {
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[0].length; col++){
				PlayingCard nonPlayableLocationCard = new PlayingCard("none", "empty", 0, "XX");
				nonPlayableLocationCard.setOutterDisplay("XXX");
				matrix[row][col] = nonPlayableLocationCard;
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
		this.nonPlayableMatrix = createMatrix(this.row, this.col);
		this.nonPlayableMatrix = populateNonPlayableMatrix(nonPlayableMatrix);
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
	
	//JP's attempt to create Matrixes that display the card short names instead of "UNFLIPPED"
	
	//Displays matrix with Card's Short Names showing
	private void displayMatrixWithCardsShowing(PlayingCard [][] matrix){
		for(row = 0; row < matrix.length; row++){
			for(col=0; col < matrix[0].length; col++){
				System.out.print(matrix[row][col].getShortName() + " ");
			}
			System.out.println();
		}
	}
	
	private void displayEmptyMatrixWithCardsshowing(PlayingCard[][] matrix){
		for(row = 0; row < matrix.length; row++){
			for(col=0; col < matrix[0].length; col++){
				System.out.print(matrix[row][col].getShortName() + " ");
			}
			System.out.println();
		}
	}

	
	
	public void displayBoardWithCardsShowing(){
		// top layer
		
		displayEmptyMatrix();
		displayMatrixWithCardsShowing(this.topMatrix);
		displayEmptyMatrix();
		
		// middle layer
		displayMatrixWithCardsShowing(this.leftMatrix);
		displayMatrixWithCardsShowing(this.centerMatrix);
		displayMatrixWithCardsShowing(this.rightMatrix);
		
		//bottom layer
		displayEmptyMatrix();
		displayMatrixWithCardsShowing(this.bottomMatrix);
		displayEmptyMatrix();
	}
	
	
	//Displays Center 3 Matrixes formatted so they actually fit together in the console. 
	public void displayCenterSectionOfFormattedMatrixWithCardsShowing(){
		for(row = 0; row < Math.max(Math.max(this.leftMatrix.length, this.centerMatrix.length), this.rightMatrix.length); row++){
			for(col=0; col < Math.max(Math.max(this.leftMatrix[0].length, this.centerMatrix[0].length), this.rightMatrix[0].length); col++){
				if( col < this.leftMatrix[0].length) {
					System.out.printf("%-10s", this.leftMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
				
			}for(col=0; col < Math.max(Math.max(this.leftMatrix[0].length, this.centerMatrix[0].length), this.rightMatrix[0].length); col++){
				if( col < this.centerMatrix[0].length) {
					System.out.printf("%-10s", this.centerMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
			}for(col=0; col < Math.max(Math.max(this.leftMatrix[0].length, this.centerMatrix[0].length), this.rightMatrix[0].length); col++){
				if( col < this.rightMatrix[0].length) {
					System.out.printf("%-10s", this.rightMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
			} System.out.println();
		}
	}
	
	
	public void displayTopSectionOfFormattedMatrixWithCardsShowing(){
		for(row = 0; row < Math.max(Math.max(this.nonPlayableMatrix.length, this.topMatrix.length), this.nonPlayableMatrix.length); row++){
			for(col=0; col < Math.max(Math.max(this.nonPlayableMatrix[0].length, this.topMatrix[0].length), this.nonPlayableMatrix[0].length); col++){
				if( col < this.nonPlayableMatrix[0].length) {
					System.out.printf("%-10s", this.nonPlayableMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
				
			}for(col=0; col < Math.max(Math.max(this.nonPlayableMatrix[0].length, this.topMatrix[0].length), this.nonPlayableMatrix[0].length); col++){
				if( col < this.topMatrix[0].length) {
					System.out.printf("%-10s", this.topMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
			}for(col=0; col < Math.max(Math.max(this.nonPlayableMatrix[0].length, this.topMatrix[0].length), this.nonPlayableMatrix[0].length); col++){
				if( col < this.nonPlayableMatrix[0].length) {
					System.out.printf("%-10s", this.nonPlayableMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
			} System.out.println();
		}
	}
	
	public void displayBottomSectionOfFormattedMatrixWithCardsShowing(){
		for(row = 0; row < Math.max(Math.max(this.nonPlayableMatrix.length, this.bottomMatrix.length), this.nonPlayableMatrix.length); row++){
			for(col=0; col < Math.max(Math.max(this.nonPlayableMatrix[0].length, this.bottomMatrix[0].length), this.nonPlayableMatrix[0].length); col++){
				if( col < this.nonPlayableMatrix[0].length) {
					System.out.printf("%-10s", this.nonPlayableMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
				
			}for(col=0; col < Math.max(Math.max(this.nonPlayableMatrix[0].length, this.bottomMatrix[0].length), this.nonPlayableMatrix[0].length); col++){
				if( col < this.bottomMatrix[0].length) {
					System.out.printf("%-10s", this.bottomMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
			}for(col=0; col < Math.max(Math.max(this.nonPlayableMatrix[0].length, this.bottomMatrix[0].length), this.nonPlayableMatrix[0].length); col++){
				if( col < this.nonPlayableMatrix[0].length) {
					System.out.printf("%-10s", this.nonPlayableMatrix[row][col].getShortName() + " ");
				}else {
					System.out.printf("%-10s", " ");
				}
			} System.out.println();
		}
	}
	
}
