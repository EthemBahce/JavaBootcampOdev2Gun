package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		
		//Bir dizi tan�mlad�k
		//Bu dizi i�erisindeki say�lar�n teker teker for d�ng�s� ile ekrana yazd�r�lmas�n� sa�lad�k
		int[] dizi = {1,2,3,4,5,56,6,77,8,1111,3333,5555,7777,89999,0};
		
		for(int i = 0; i < dizi.length; i++) {
			System.out.println(i + ".nci sat�rdaki say� = " + dizi[i]);
		}

	}

}
