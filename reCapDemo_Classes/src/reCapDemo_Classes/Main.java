package reCapDemo_Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lütfen birinci ve ikinci sayýyý giriniz");
		System.out.println("Ýkinci sayý sýfýra eþit olmamalýdýr!");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		int sayi1 = scan1.nextInt();
		int sayi2 = scan2.nextInt();
		
        DortIslem dortIslem1 = new DortIslem();
        double toplam  = dortIslem1.topla(sayi1, sayi2);
        double cýkarma = dortIslem1.cýkar(sayi1, sayi2);
        long bolme   = dortIslem1.böl(sayi1, sayi2);
        double carpma  = dortIslem1.carp(sayi1, sayi2);
        
        if(sayi2 == 0) {
        	System.out.println("Sayý 0'a eþittir. Hatalý sayý giriþi..!");
        	return;
        }
        else {
        System.out.println("Sayýlarýn toplamý = "+ toplam);
        System.out.println("Sayýlarýn farký =" + cýkarma);
        System.out.println("Sayýlarýn birbirine bölümü = " + bolme);
        System.out.println("sayýlarýn çarpýmý = " + carpma);
        }
        
        
        
        
		

	}

}
