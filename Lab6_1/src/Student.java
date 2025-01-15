
public class Student {
	
	//private attribute
	private String name;
	private double[] scores;
	
	public void setStudentDeatail(String stdName, double[] stdScores) {
	
		name = stdName;
		scores = stdScores;
		
	}
	
	public double calculateAverageScore() {
		
		double total = 0;
		for(double _scores : scores) {
			total += _scores;
		}
		
		return total / scores.length;
		
	}
	
	public String getGrade() {
		
		double average = calculateAverageScore();
		if(average >= 90) {
			return "A";
		}else if(average >= 80) {
			return "B";
		}else if(average >= 70) {
			return "C";
		}else if(average >= 60) {
			return "D";
		}else {
			return "F";
		}
	}
	
	public void displayStudentDetails() {
		
		System.out.println("Name: " + name);
		System.out.print("Score: ");
		for(double _scores : scores) {
			System.out.print(_scores + " ");
		}
		System.out.println("\nAverage Score: " + calculateAverageScore());
		System.out.println("Grade: " + getGrade());

	}
	

}
