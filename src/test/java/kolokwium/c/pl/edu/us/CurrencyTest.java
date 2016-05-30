package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class CurrencyTest
{
	@Test
	public void convertFromPlnTest() {
		Currency testingCurrency = new Currency("fakeWaluta", 5);
		
		//assertEquals(2.0, testingCurrency.convertFromPLN(10));
		assertTrue(testingCurrency.convertFromPLN(10) == 2.0);
	}
	
	@Test
	public void convertToPlnTest() {
		Currency testingCurrency = new Currency("fakeWaluta", 5);
		
		assertTrue(testingCurrency.convertToPLN(10) == 50.0);
	}
}