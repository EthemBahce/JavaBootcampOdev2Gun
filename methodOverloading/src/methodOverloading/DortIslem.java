package methodOverloading;

public class DortIslem {
	
	public static double topla(int sayi1 , int sayi2) {
		return sayi1 + sayi2;
	}
	
	
	public static double topla(int sayi1 , int sayi2, int sayi3) {
		return sayi1 + sayi2 + sayi3;
	}
	
	
	public static double c�kar(int sayi1 , int sayi2) {
		return sayi1 - sayi2;
	}
	
	public static double carp(int sayi1 , int sayi2) {
		return sayi1 * sayi2;
	}
	
	public static long b�l(int sayi1 , int sayi2) {
		return (sayi1 / sayi2);
	}

}
