package oop1;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(10);
		product1.setUnitsInStock(2);
		product1.setImageUrl("x.jpeg");
		
			
		
		Product[] products = {product1};
		
       System.out.println("<ul>");
		
		for (Product product : products) {
			
			System.out.println("<li>" + product.getName() + "</li>");
			System.out.println("<li>" + product.getUnitPrice() + "</li>");
		}
		
		System.out.println("</ul>");
		*/
		
		
		Customer customer1 = new IndividualCustomer();
		customer1.setCustomerNumber("100");
		customer1.setId(1);
		customer1.setPhone("05443122408");
		
		
		//customer1 stack üzerinde oluþtu ve heap üzerinde oluþan IndividualCustomer()'ýn deðerlerini tutuyor.
		
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("11111111111");
		individualCustomer.setId(1);
		individualCustomer.setPhone("0512*39*01293*0193012");
		individualCustomer.setFirstName("Ethem");
		individualCustomer.setLastName("Bahçe");
		
		
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("123123123123");
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0544213123123123123");
		corporateCustomer.setTaxNumber("222222");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
			System.out.println(customer.getId());
			System.out.println(customer.getPhone());
			System.out.println(customer.getClass());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// Set value
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;
		product1.imageUrl = "x.jpg";
		
		
		product2.name = "beko Kahve Makinesi";
		product2.unitPrice = 6500;
		product2.discount = 10;
		product2.unitsInStock = 6;
		product2.imageUrl = "y.jpg";
		
		
		//Get value
		System.out.println(product1.name);
		System.out.println(product2.name);
		
		
		Product[] products = {product1, product2};
		
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			
			System.out.println("<li>" + product.name + "</li>");
		}
		
		System.out.println("</ul>"); */
	}

}
