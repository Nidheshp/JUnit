import static org.junit.Assert.*;

import org.junit.Test;

public class TestUniqueSum {

	@Test
	public void testUniqueSum() {
		UniqueSum testing = new UniqueSum();
		assertEquals("not working",15,testing.Sum(15, 18, 18));
		assertEquals("not working",16,testing.Sum(18, 16, 18));
		assertEquals("not working",17,testing.Sum(18, 18, 17));
		assertEquals("not working",48,testing.Sum(15, 16, 17));
		assertEquals("not working",0,testing.Sum(18, 18, 18));
	}

}
