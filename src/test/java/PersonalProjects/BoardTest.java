package PersonalProjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testPopulateOuterMatrix() {
		FullDeck deck = new FullDeck();
		Board board = new Board(deck);
		PlayingCard[][] leftMatrix = board.getLeftMatrix();
		
		PlayingCard card = leftMatrix[1][2];
		
		
		assertTrue(card.getValue() >=1 && card.getValue() <=14);
	}

}
