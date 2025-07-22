package assignment1.entityclassassignment2;

public class Product {
	public String ProductName;
	public int ProductId;
	public String ProductColor;
	
	
	public Product(String ProductName, int ProductId, String ProductColor){
		this.ProductName = ProductName;
		this.ProductId = ProductId;
		this.ProductColor = ProductColor;
	}
	
	public void display() {
		System.out.println("Name: " + ProductName + ", Id: " + ProductId + ", Colour: " + ProductColor);
	}
}
