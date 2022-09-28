package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		
		//Bir dizi tanýmladýk
		//Bu dizi içerisindeki sayýlarýn teker teker for döngüsü ile ekrana yazdýrýlmasýný saðladýk
		int[] dizi = {1,2,3,4,5,56,6,77,8,1111,3333,5555,7777,89999,0};
		
		for(int i = 0; i < dizi.length; i++) {
			System.out.println(i + ".nci satýrdaki sayý = " + dizi[i]);
		}

	}

}
