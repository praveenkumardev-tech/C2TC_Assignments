package assignment2.assignmentDay2;

import java.util.Scanner;

//Student class with default constructor
	class Customer {
	 Customer() {
	     System.out.println("Student object is created");
	 }
	}
	
	//Commission class
	class Commission {
	 // Data Members
	 String name, address, phone;
	 double sales_amount;
	
	 // Method to accept details
	 void acceptDetails() {
	     Scanner sc = new Scanner(System.in);
	
	     System.out.print("Enter Name: ");
	     name = sc.nextLine();
	
	     System.out.print("Enter Address: ");
	     address = sc.nextLine();
	
	     System.out.print("Enter Phone: ");
	     phone = sc.nextLine();
	
	     System.out.print("Enter Sales Amount: ");
	     sales_amount = sc.nextDouble();
	 }
	
	 // Method to calculate and display commission
	 void calculateCommission() {
	     double commission;
	     if (sales_amount >= 100000) {
	         commission = 0.10 * sales_amount;
	     } else if (sales_amount >= 50000) {
	         commission = 0.05 * sales_amount;
	     } else if (sales_amount >= 30000) {
	         commission = 0.03 * sales_amount;
	     } else {
	         commission = 0;
	     }
	
	     System.out.println("Commission for " + name + ": ₹" + commission);
	 }
	}