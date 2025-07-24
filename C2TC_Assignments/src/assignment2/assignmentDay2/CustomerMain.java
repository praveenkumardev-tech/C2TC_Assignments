package assignment2.assignmentDay2;

public class CustomerMain {

	public class Main {
	    public static void main(String[] args) {
	        // Create Student object (to invoke default constructor)
	        Customer s = new Customer();

	        // Create Commission object and call methods
	        Commission c = new Commission();
	        c.acceptDetails();
	        c.calculateCommission();
	    }
	}
}
