package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class CurrencyTest
{
	@Test
	public void convertFromPlnTest() {
		Currency testingCurrency = new Currency("fakeWaluta", 5);
		
		assertEquals(2.0, testingCurrency.convertFromPLN(10), Double.MIN_VALUE);
	}
	
	@Test
	public void convertToPlnTest() {
		Currency testingCurrency = new Currency("fakeWaluta", 5);
		
		assertEquals(50.0, testingCurrency.convertToPLN(10), Double.MIN_VALUE);
	}
}