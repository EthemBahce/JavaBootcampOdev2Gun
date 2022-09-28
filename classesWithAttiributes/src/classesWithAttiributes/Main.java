package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"laptop","bilgisayar",1000,15,"kýrmýzý");
		/*product1.setName("Nokýa 6600");
		product1.setId(1);
		product1.setPrice(11.948);
		product1.setStockAmount(12);
		product1.setDescription("Telephone");*/
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);

	}

}
