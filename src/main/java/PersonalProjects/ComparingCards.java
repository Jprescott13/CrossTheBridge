package PersonalProjects;

public class ComparingCards {
	private boolean isHigher = false;
	private boolean isLower = false;
	private boolean isRed = false;
	private boolean isBlack = false;
	private boolean isOdd = false;
	private boolean isEven = false;
	private boolean isFace = false;
	private boolean isShowing = false; // this is the status that will be used to determine which cards have been flipped in the gameI've beee
	
	public ComparingCards() {
		
	}
	
	public void compareValue(PlayingCard firstCard, PlayingCard secondCard){
		if(secondCard.getValue() > firstCard.getValue() ){
			isHigher = true;
		}
		if (secondCard.getValue() < firstCard.getValue() ) {
			isLower = true;
		}	
	}
	
	public void compareColor(PlayingCard secondCard) {
		if(secondCard.getSuit() == "Diamonds" || secondCard.getSuit() == "Hearts" ){
			isRed = true;
		}
		if (secondCard.getSuit() == "Spades"  || secondCard.getSuit() == "Clubs"){
			isBlack = true;
		}
	}
	
	public void compareOddEvenFace(PlayingCard secondCard) {
		if(secondCard.getValue() <= 10){
			if(secondCard.getValue() % 2 == 0){
				isEven = true;
			}if(secondCard.getValue() %2 != 0) {
				isOdd = true;
			}else {
				System.out.println("NOT ODD OR EVEN -- YOU HAVE AN ISSUE");
			}
		}if (secondCard.getValue() >10 ) {
			isFace = true;
		}else {
			System.out.println("NOT ODD, EVEN, OR FACE -- YOU HAVE A MASSIVE ISSUE");
		}
	}
	
	
	

	public boolean isHigher() {
		return isHigher;
	}

	public void setHigher(boolean isHigher) {
		this.isHigher = isHigher;
	}

	public boolean isLower() {
		return isLower;
	}

	public void setLower(boolean isLower) {
		this.isLower = isLower;
	}

	public boolean isRed() {
		return isRed;
	}

	public void setRed(boolean isRed) {
		this.isRed = isRed;
	}

	public boolean isBlack() {
		return isBlack;
	}

	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	public boolean isOdd() {
		return isOdd;
	}

	public void setOdd(boolean isOdd) {
		this.isOdd = isOdd;
	}

	public boolean isEven() {
		return isEven;
	}

	public void setEven(boolean isEven) {
		this.isEven = isEven;
	}

	public boolean isFace() {
		return isFace;
	}

	public void setFace(boolean isFace) {
		this.isFace = isFace;
	}

	public boolean isShowing() {
		return isShowing;
	}

	public void setShowing(boolean isShowing) {
		this.isShowing = isShowing;
	}

}
