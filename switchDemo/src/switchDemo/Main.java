package switchDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Lütfen bir kelime giriniz.");
		
		Scanner scan1 = new Scanner(System.in);
		String str = scan1.nextLine();
		char grade = str.charAt(0);
		
		
		switch (grade) {
		case 'A':
			System.out.println("Dersi baþarýyla geçtiniz");
			break;
		case 'B' :
			System.out.println("Dersi iyi olarak geçtiniz");
			break;
		case 'C' :
			System.out.println("Dersi orta olarak geçtiniz");
			break;
		case 'D' :
			System.out.println("Dersi þartlý olarak geçtiniz");
		    break;
		default:
				System.out.println("Dersten maalesef kaldýnýz");
			break;
		}

	}

}
