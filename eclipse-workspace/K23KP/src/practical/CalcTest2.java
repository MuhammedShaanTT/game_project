package practical;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalcTest2 {
	
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
    	Calc c = new Calc(55,50,52);
    	assertEquals("Second division", c.getDivision());
    }
    @Test
    public void testThirdDivision() {
    	Calc c = new Calc(45,40,42);
    	assertEquals("Third division" , c.getDivision());
    }
    @Test
    public void fail() {
    	Calc c = new Calc(1,1,1);
    	assertEquals("Fail", c.getDivision());
    	}
    @Test
    public void not_a_valid_input() {
    	Calc c = new Calc(011111,11111,111);
    	assertEquals("Not a valid output", c.getDivision());
    }
}

