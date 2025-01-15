
public class Employee {
	
	//private attribute

	private String name;
	private int hourWork;
	private double hourlyRate;

	//method to set employee details
	public void setEmployeeDetails(String empName, int hours, double rate){

		name = empName;
		hourWork = hours;
		hourlyRate = rate;
		
	}

	//method to calculate salary
	public double calculateSalary(){

		double salary = hourWork * hourlyRate;

		if (hourWork > 40) { 
			double bonus = salary * 0.10; 
			salary += bonus; 
		}

		return salary;
	}

	public void displayEmployeeDetails(){

		System.out.println("Name: " + name);
		System.out.println("Hours Worked: " + hourWork);
		System.out.println("Hourly  Rate: " + hourlyRate);
		System.out.println("Total Salary: " + calculateSalary());
	}

}