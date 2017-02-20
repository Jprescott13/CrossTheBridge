package PersonalProjects;

public class PlayingCard {
	
	private int value;
	private String suit;
	private String name;
	private String shortName;
	private String color;

	public PlayingCard(String suit, String name, int value, String shortName) {
		this.suit = suit;
		this.name = name;
		this.value = value;
		this.shortName = shortName;
	}
	
	public int compareCardValue (PlayingCard cardToCompare){
		if(this.getValue() > cardToCompare.getValue() ){
			return 1;
		}else if (this.getValue() < cardToCompare.getValue() ){
			return -1;
		}else {
			return 0;
		}
	}
	
	public int compareCardColor (PlayingCard cardToCompare, String selectedColor) {
		if (selectedColor == cardToCompare.getColor()) {
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

}
