package reCapDemo_Classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("L�tfen birinci ve ikinci say�y� giriniz");
		System.out.println("�kinci say� s�f�ra e�it olmamal�d�r!");
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		
		int sayi1 = scan1.nextInt();
		int sayi2 = scan2.nextInt();
		
        DortIslem dortIslem1 = new DortIslem();
        double toplam  = dortIslem1.topla(sayi1, sayi2);
        double c�karma = dortIslem1.c�kar(sayi1, sayi2);
        long bolme   = dortIslem1.b�l(sayi1, sayi2);
        double carpma  = dortIslem1.carp(sayi1, sayi2);
        
        if(sayi2 == 0) {
        	System.out.println("Say� 0'a e�ittir. Hatal� say� giri�i..!");
        	return;
        }
        else {
        System.out.println("Say�lar�n toplam� = "+ toplam);
        System.out.println("Say�lar�n fark� =" + c�karma);
        System.out.println("Say�lar�n birbirine b�l�m� = " + bolme);
        System.out.println("say�lar�n �arp�m� = " + carpma);
        }
        
        
        
        
		

	}

}
