import java.util.*;

public class TestEmployeeInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp1 = new Employee(); 
		Employee emp2 = new Employee();
		
		System.out.println("Enter details for employee 1:");
		System.out.print("Name: ");
		String empName1 = sc.nextLine();
		System.out.print("Name: ");
		int empHourWorked1 = sc.nextInt();
		System.out.print("Name: ");
		double empHourRate1 = sc.nextDouble();
		
		//emp1.setEmployeeDetails(emp1, empHourWorked1, empHourRate1);
		Line('-');
		//emp1.setEmployeeDetails();
		Line('*');

		
		sc.close();
	}
	
	public static void Line(char symbol) {
		
		for(int i = 1; i <= 50; i++) {
			System.out.print(symbol);
		}
		
	}

}
