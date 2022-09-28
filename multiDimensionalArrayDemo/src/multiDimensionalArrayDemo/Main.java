package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler = new String[3][3]; 
		
		sehirler[0][0]="Ýstanbul";
		sehirler[0][1]="Ankara";
		sehirler[0][2]="izmir";
		sehirler[1][0]="Bursa";
		sehirler[1][1]="Antalya";
		sehirler[1][2]="Eskiþehir";
		sehirler[2][0]="Mersin";
		sehirler[2][1]="Hatay";
		sehirler[2][2]="Adana";
		
		
				
		for(int i = 0; i<sehirler.length;i++) {
			for(int j = 0; j<sehirler.length;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
		

	}

}
