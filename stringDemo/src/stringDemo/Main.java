package stringDemo;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel";
		
		System.out.println("Eleman say�s� : " + mesaj.length());
		
		System.out.println("5. eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!"));
		System.out.println(mesaj);
		
		
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.substring(2));
		
	
		

	}

}
