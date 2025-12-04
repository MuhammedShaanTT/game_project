package practical;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest {
	
	@Test
	public void testDistinction() {
		Calc c = new Calc(90, 85, 80);
		assertEquals("First division with distinction", c.getDivision());
	}
	
	@Test
	public void testFirstDivision() {
		Calc c = new Calc(65, 60, 62);
		assertEquals("First division", c.getDivision());
	}
	@Test
    public void testSecondDivision() {
    	Calc c = new Calc(50,50,50);
    	assertEquals("second division", c.getDivision());
    }
    @Test
    public void testThirdDivision() {
    	Calc c = new Calc(35,35,35);
    	assertEquals("third division" , c.getDivision());
    }
}
