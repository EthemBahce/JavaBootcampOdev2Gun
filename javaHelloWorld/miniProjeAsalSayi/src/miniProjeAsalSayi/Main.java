package miniProjeAsalSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("L�tfen 1'den b�y�k bir say� giriniz");
		
		
		Scanner scan1 = new Scanner(System.in);
		int number = scan1.nextInt();
		
		/*int reminder = number % 2;
		
		System.out.println("Kalan : " + reminder); */
		
		int i;
		
		
		if(number == 1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Ge�ersiz say�. ");
		}
		
		if(number == 2) {
			System.out.println("Say� asal de�ildir");
			return;
		}
		
		for(i = 2; i < number; i++) {
			
				
				if(number % i == 0 && number == 2) {
					System.out.println("Say� asal de�ildir.");
					break;
				}
				else {
					System.out.println("Say� asald�r");
					break;
				}
			
			
		}
		
		
		
		
		

	}

}
