package whileDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Bir sayi giriniz (0 ile 50 arasýnda ve 0 ile 50 dahil deðil!)");
		Scanner scan1 = new Scanner(System.in);
		int sayi1 = scan1.nextInt();
		
		
		
		
		
		while(0 < sayi1 && sayi1 <50) {
			System.out.println("Sayi while döngüsü ile:" + sayi1);
			sayi1++;
		}
		
		
		
		
		
		System.out.println("while döngüsü sona erdi");
		
		System.out.println("-------------------------------------");
		
		System.out.println("do - while döngüsü örneði");
		
		
		do {
			System.out.println("Sayýlarýn toplamý :" + sayi1);
			sayi1 = sayi1 + 2;
			sayi1+=2;
		} while (sayi1 > 0 && sayi1 < 50);
		
		
		

	}

}
