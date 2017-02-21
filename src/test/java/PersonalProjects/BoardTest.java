package PersonalProjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class BoardTest {

	@Test
	public void testPopulateOuterMatrix() {
		FullDeck deck = new FullDeck();
		Board board = new Board(deck, 3,4);

		board.generateBoard();
		board.getLeftMatrix();
		board.displayBoard();
		
	}
	
	@Test
	public void testRandomLocation(){
		FullDeck deck = new FullDeck();
	}
}
