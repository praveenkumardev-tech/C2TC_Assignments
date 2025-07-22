package assignment1.entityclassassignment1;
import java.util.Scanner;
public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[3];
		
		for(int i = 0; i < students.length; i++) {
			System.out.println("Enter The Student Details: " + (i + 1));
			
			
			System.out.print("Enter the Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter the Name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter the Department: ");
			String department = sc.nextLine();
			
			students[i] = new Student(name, id, department);
				
		}
		for(Student s: students) {
			s.display();
		}
	}
}
