package PersonalProjects;

public class PlayingCard {
	
	private int value;
	private String suit;
	private String name;
	private String shortName;

	public PlayingCard(String suit, String name, int value, String shortName) {
		this.suit = suit;
		this.name = name;
		this.value = value;
		this.shortName = shortName;
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

}
