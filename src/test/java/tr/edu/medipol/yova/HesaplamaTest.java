package tr.edu.medipol.yova;

import static org.junit.Assert.*;


import org.junit.Test;


public class HesaplamaTest {

	@Test
	public void testToplama() {
		
		int sayi1=1;
		int sayi2=Integer.MAX_VALUE;
		Hesaplama h = new Hesaplama();
		
		
		long gerceklesen = h.toplama(42,28);
		
		assertEquals( 70 ,gerceklesen);
	}

}
