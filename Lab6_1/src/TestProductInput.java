
import java.util.*;

public class TestProductInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();

		System.out.print("Enter product name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter product price: ");
		double price = sc.nextDouble();
		
		System.out.print("Enter VAT rate (%): ");
		double vatRate = sc.nextDouble();
		
		product.setProductDetails(name, price, vatRate);
		
		//display
		System.out.println("\nProduct Details:");
		product.displayProductDetails();
		
		sc.close();
	}
}