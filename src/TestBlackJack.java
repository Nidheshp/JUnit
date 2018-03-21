import static org.junit.Assert.*;

import org.junit.Test;

public class TestBlackJack {

	@Test
	public void testBlackJack() {
		BlackJack testing = new BlackJack();
		assertEquals("not working",21,testing.blackjack(21, 22));
		assertEquals("not working",21,testing.blackjack(21, 20));
		assertEquals("not working",20,testing.blackjack(16, 20));
		assertEquals("not working",20,testing.blackjack(22, 20));
		assertEquals("not working",7,testing.blackjack(7, 7));
		assertEquals("not working",0,testing.blackjack(22, 22));
	}

}
