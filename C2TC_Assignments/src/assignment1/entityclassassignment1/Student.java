package assignment1.entityclassassignment1;

public class Student {
	public String name;
	public int id;
	public String department;


	public Student(String name, int id, String department){
		this.name = name;
		this.id = id;
		this.department = department;
	}
	
	public void display() {
		System.out.println("Name: " + name + ", Id: " + id + ", Department: " + department);
	}
	
}

