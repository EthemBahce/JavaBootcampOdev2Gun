package classes;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager1 = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager1.Add();
		customerManager1.Delete();
		customerManager1.Update();
		customerManager1.getClass();
		
		System.out.println("-------------------------");
		
		customerManager2.Add();
		customerManager2.Delete();
		customerManager2.Update();
		customerManager2.getClass();
		
		
		int[] dizi1 = new int[] {1,2,3,};
		int[] dizi2 = new int[] {4,5,6};
		
	    dizi1 = dizi2;
	    
	    dizi2[0] = 1000;
	    
	    for(int i = 0; i<dizi1.length; i++) {
	    	System.out.println(dizi2[i]);
	    }
	    
	    
	    int sayi1 = 10;
	    int sayi2 = 25;
	    
	    sayi2 = sayi1;
	    
	    sayi1 = 55;
	    
	    System.out.println("sayi1 = " + sayi1);
	    System.out.println("sayi2 = " + sayi2);
		
		
		 
		 

	}

	
	
	
	
	
	
	
}
