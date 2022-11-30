package tr.edu.medipol.yova;

import static org.junit.Assert.*;


import org.junit.Test;


public class HesaplamaTest {

	
  @Test
  public void testCarpma() {
	  int sayi1=3;
	  int sayi2=5;
	  Hesaplama h = new Hesaplama ();
	  
	  int sonuc = h.carpma(3,5);
	  assertEquals(15,sonuc);
	  
  }
  
  @Test
  public void testBolme() {
	  int sayi1=10;
	  int sayi2=5;
	  
	  Hesaplama h = new Hesaplama ();
	  int sonuc = h.bolme(10,5);
	  assertEquals(2,sonuc);
	  
	  }
  @Test
  public void testCikarma() {
	  int sayi1=2;
	  int sayi2=1;
	  
	  Hesaplama h = new Hesaplama();
	  int sonuc = h.cikarma(2,1);
	  assertEquals(2,sonuc);
	  
	  
  }
  @Test
  public void testUsAlma() {
	  
	  int sayi1=2;
	  int sayi2 = 3;
	  
	  Hesaplama h = new Hesaplama ();
	  int sonuc = h.usalma(2,3);
	  assertEquals(8,sonuc);
  }
  
}
