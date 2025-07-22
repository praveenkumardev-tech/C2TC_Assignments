package assignment1.entityclassassignment2;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Product[] products = new Product[4];
		
		for(int i = 0; i < products.length; i++) {
			System.out.println("Enter the Students Details: " + (i + 1));
			
			System.out.print("ProductId: ");
			int ProductId = sc.nextInt();
			sc.nextLine();
			
			System.out.print("ProductName: ");
			String ProductName = sc.nextLine();
			
			System.out.print("ProductColour: ");
			String ProductColour = sc.nextLine();
			
			products[i] = new Product(ProductName, ProductId, ProductColour);
		}
		for(Product p : products) {
			p.display();
		}
	}
}
