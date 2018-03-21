import static org.junit.Assert.*;

import org.junit.Test;

public class TestToohot {

	@Test
	public void testToohot() {
		Toohot testing = new Toohot();
		assertEquals("not working",true,testing.toohot(75,false));
		assertEquals("not working",false,testing.toohot(55,false));
		assertEquals("not working",true,testing.toohot(95,true));
		assertEquals("not working",false,testing.toohot(97,false));

	}

}
