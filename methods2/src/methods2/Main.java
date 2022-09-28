package methods2;

public class Main {

	public static void main(String[] args) {
		
		isimVer("Ethem","Bahçe");
		int toplam = topla(10,20);
		String adSoyad = isimVer2("Ahmet", "Yýldýrým");
		
		System.out.println("Methodlardan return edilen deðerler.");
		System.out.println(toplam);
		System.out.println(adSoyad);
		
	}
	
	
	public static void isimVer(String ad, String soyad) {
		System.out.println(ad + " " + soyad);
		System.out.println("void tipinde metod çalýþtý.");
	}
	
	
	public static int topla(int sayi1, int sayi2) {
		System.out.println("integer tipinde metod çalýþtý.");
		return sayi1 + sayi2;
		
	}
	
	public static String isimVer2(String ad,String soyad) {
		System.out.println("String tipinde metod çalýþtý.");
		return ad + " " + soyad;
	}
	
	
	

}
