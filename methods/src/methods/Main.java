package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();

	}
	
	
	public static void 	sayiBulmaca() {
		
		int[] sayilar = new int[] {1, 2, 4, 3, 9, 6};
		int aranacak = 6;
		boolean varM� = false;
		
		for(int sayi : sayilar)
		{
			if(sayi == aranacak) {
				varM� = true;
				break;
			}
			
		    if(varM�) {
		    	
			mesajVer(aranacak);
			
			}
		    else {
		    	
			System.out.println("Say� mevcut de�ildir : " + aranacak);
			
		    }
			
		}
		
				
				
				
	}
	
	
	public static void mesajVer(int aranacak) {
		System.out.println("Say� mevcuttur" + aranacak);
	}
	

}
