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
	
}
