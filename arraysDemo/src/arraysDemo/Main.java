package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		 String[] ogrenciler = new String[5];
		 ogrenciler[0] = "Ethem";
		 ogrenciler[1] = "Zeynep";
		 ogrenciler[2] = "Mehmet";
		 ogrenciler[3] = "Ziya";
		 ogrenciler[4] = "Murat";
		 
		 
		 for(String ogrenci: ogrenciler) {
			 System.out.println(ogrenci); 
		 }
		 
		 System.out.println("---------------");
		 
		 
		 for(int i = 0; i<ogrenciler.length;i++) {
			 System.out.println(ogrenciler[i]);
		 }

	}
	
	

}
 

