package methods2;

public class Main {

	public static void main(String[] args) {
		
		isimVer("Ethem","Bah�e");
		int toplam = topla(10,20);
		String adSoyad = isimVer2("Ahmet", "Y�ld�r�m");
		
		System.out.println("Methodlardan return edilen de�erler.");
		System.out.println(toplam);
		System.out.println(adSoyad);
		
	}
	
	
	public static void isimVer(String ad, String soyad) {
		System.out.println(ad + " " + soyad);
		System.out.println("void tipinde metod �al��t�.");
	}
	
	
	public static int topla(int sayi1, int sayi2) {
		System.out.println("integer tipinde metod �al��t�.");
		return sayi1 + sayi2;
		
	}
	
	public static String isimVer2(String ad,String soyad) {
		System.out.println("String tipinde metod �al��t�.");
		return ad + " " + soyad;
	}
	
	
	

}
