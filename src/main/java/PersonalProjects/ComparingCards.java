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
