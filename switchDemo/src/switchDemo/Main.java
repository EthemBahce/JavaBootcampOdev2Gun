package switchDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("L�tfen bir kelime giriniz.");
		
		Scanner scan1 = new Scanner(System.in);
		String str = scan1.nextLine();
		char grade = str.charAt(0);
		
		
		switch (grade) {
		case 'A':
			System.out.println("Dersi ba�ar�yla ge�tiniz");
			break;
		case 'B' :
			System.out.println("Dersi iyi olarak ge�tiniz");
			break;
		case 'C' :
			System.out.println("Dersi orta olarak ge�tiniz");
			break;
		case 'D' :
			System.out.println("Dersi �artl� olarak ge�tiniz");
		    break;
		default:
				System.out.println("Dersten maalesef kald�n�z");
			break;
		}

	}

}
