package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		Hesaplama h = new Hesaplama();
		int s = h.toplama(42,28);
		System.out.println(s);
;		
	}
	
	int toplama(int sayi1,int sayi2) {
		int sonuc= sayi1+sayi2;
		return sonuc ;
	}
	
	int carpma (int sayi1, int sayi2) {
		return sayi1*sayi2;
	}
	
	
	int cikarma(int sayi1, int sayi2) {
		return sayi1-sayi2;
	}
	
	int bolme (int sayi1 , int sayi2 ) {
		return sayi2 / sayi2;
	}
	
	int usalma (int sayi1,int sayi2) {
		int sonuc = (int) Math.pow(sayi1, sayi2);
		return sonuc ;
	}
	
}
