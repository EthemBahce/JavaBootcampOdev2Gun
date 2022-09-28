package recapDemo1;


import java.io.Closeable;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
    Scanner scan1 = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);
    Scanner scan3 = new Scanner(System.in);
    
    System.out.println("Lütfen birinci sayýyý giriniz");
    int sayi1 = scan1.nextInt();
    
    System.out.println("Lütfen ikinci sayýyý giriniz");
    int sayi2 = scan2.nextInt();
    
    System.out.println("Lütfen üçüncü sayýyý giriniz");
    int sayi3 = scan3.nextInt();
    
    
    
    int enBuyukSayi = 0;
    
    int[] dizi = {sayi1, sayi2, sayi3};
    
    
    if(dizi[0] <= dizi[1] & dizi[1] <= dizi[2] ){
    	enBuyukSayi = dizi[2];
    }
    else if(dizi[1] <= dizi[0] & dizi[0] <= dizi[2]) {
    	enBuyukSayi = dizi[2];
    }
    else if(dizi[1] <= dizi[0] & dizi[2] <= dizi[0]) {
    	enBuyukSayi = dizi[0];
    }
    else if(dizi[2] <= dizi[1] & dizi[1] <= dizi[0]) {
    	enBuyukSayi = dizi[0];
    }
    else if(dizi[0] <= dizi[2] & dizi[2] <= dizi[1]) {
    	enBuyukSayi = dizi[1];
    }
    else if(dizi[2] <= dizi[0] & dizi[2] <= dizi[1]) {
    	enBuyukSayi = dizi[1];
    }
    
    System.out.println("En büyük sayý = " + enBuyukSayi); 
    
   /* int enBuyuk = sayi1;
    
    if(enBuyuk < sayi2) {
    	enBuyuk = sayi2;
    }
    else if(enBuyuk < sayi3) {
    	enBuyuk = sayi3;
    }
    
    */
    
    
    
   
    
    
    
    
   
		
		
	}

}
