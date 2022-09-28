package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	
	public static void 	sayiBulmaca() {
		
		int[] sayilar = new int[] {1, 2, 4, 3, 9, 6};
		int aranacak = 6;
		boolean varMÝ = false;
		
		for(int sayi : sayilar)
		{
			if(sayi == aranacak) {
				varMÝ = true;
				break;
			}
			
		    if(varMÝ) {
		    	
			mesajVer(aranacak);
			
			}
		    else {
		    	
			System.out.println("Sayý mevcut deðildir : " + aranacak);
			
		    }
			
		}
		
				
				
				
	}
	
	
	public static void mesajVer(int aranacak) {
		System.out.println("Sayý mevcuttur" + aranacak);
	}
	

}
