package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Lütfen 1'den büyük bir sayý giriniz");
		
		
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();
		
		/*int reminder = number % 2;
		
		System.out.println("Kalan : " + reminder); */
		
		int i;
		
		
		if(number == 1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Geçersiz sayý. ");
		}
		
		if(number == 2) {
			System.out.println("Sayý asal deðildir");
			return;
		}
		
		for(i = 2; i < number; i++) {
			
				
				if(number % i == 0 && number == 2) {
					System.out.println("Sayý asal deðildir.");
					break;
				}
				else {
					System.out.println("Sayý asaldýr");
					break;
				}
			
			
		}
		
		
		
		
		

	}

}
