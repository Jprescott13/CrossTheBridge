package PersonalProjects;

public class PlayingCard {
	
	private int value;
	private String suit;
	private String name;
	private String shortName;
	private String color;
	private boolean faceIsShowing;
	private String outterDisplay = "UNFLIPPEDCARD";



	public PlayingCard(String suit, String name, int value, String shortName) {
		this.suit = suit;
		this.name = name;
		this.value = value;
		this.shortName = shortName;
	}
	
	//Compare Higher and Lower
	public int compareCardValue (PlayingCard cardToCompare){
		if(this.getValue() > cardToCompare.getValue() ){
			return 1;
		}else if (this.getValue() < cardToCompare.getValue() ){
			return -1;
		}else {
			return 0;
		}
	}
	
	//Compare Red or Black
	public int compareCardColor (String selectedColor) {
		if (selectedColor == this.getColor()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	//Compare Odd, Even or Face
	
	public int compareOddEvenOrFace(String oddEvenOrFace) {
		if ((this.getValue()> 10) && (oddEvenOrFace == "Face")){
			return 1;
		}else if((this.getValue() <=10) && (this.getValue()%2 == 0) && (oddEvenOrFace == "Even")){
			return 1;
		}else if((this.getValue() <=10) && (this.getValue()%2 != 0) && (oddEvenOrFace == "Odd")){
			return 1;
		}else {
			return -1;
		}
	}
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getColor() {
		if ((this.getSuit() == "Diamonds") || (this.getSuit() == "Hearts")){
			color = "Red";
		}else {
			color = "Black";
		}
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// Set and get display for unflipped cards
	public void setOutterDisplay(String outterDisplay) {
		this.outterDisplay = outterDisplay;
	}

	public String getOutterDisplay() {
		return outterDisplay;
	}

	public boolean isFaceIsShowing() {
		return faceIsShowing;
	}

	public void setFaceIsShowing(boolean faceIsShowing) {
		this.faceIsShowing = faceIsShowing;
	}


}
