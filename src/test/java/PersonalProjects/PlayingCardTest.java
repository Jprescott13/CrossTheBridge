package PersonalProjects;

import static org.junit.Assert.*;
import org.junit.*;

public class PlayingCardTest {
	
	
	
	public PlayingCardTest() {
		
		PlayingCard sampleCard = new PlayingCard("Diamonds", "Two", 2, "D2");
		PlayingCard testCard2 = new PlayingCard("Spades", "Two", 2, "S2");
		PlayingCard testCard3 = new PlayingCard("Hearts", "Three", 3, "S3");
		PlayingCard testCard4 = new PlayingCard("Clubs", "Four", 4, "S4");
		PlayingCard testCard5 = new PlayingCard("Diamonds", "Five", 5, "S5");
		PlayingCard testCard6 = new PlayingCard("Spades", "Six", 6, "S6");
		
//		@Test
//		public void testCompareCardValue(){
//			assertEquals(true, sampleCard.compareCardValue(new PlayingCard("Hearts", "Two", 2, "H2" )));
//			assertEquals(false, sampleCard.compareCardValue(testCard3));
//			assertEquals(false, sampleCard.compareCardValue(testCard4));
			
//		}
		
		
	}

}
