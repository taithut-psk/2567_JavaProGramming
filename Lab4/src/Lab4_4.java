import java.util.*;
public class Lab4_4 {

	public static void main(String[] args) {
		inputStudent();
	}
	
	public static void inputStudent() {
		Scanner sc = new Scanner(System.in);
		String studentID = "", subjectCode = "";
		
		while(!isLength(studentID, 10)) {
			System.out.print("Enter Student ID: ");
			studentID = sc.nextLine();
		}
		
		while(!isLength(subjectCode, 7)) {
			System.out.print("Enter Subject ID: ");
			subjectCode = sc.nextLine();
		}
			
		String isITStudent = studentID, isITSubject;
		displayData(isITStudent, isITSubject);

		
	}
	
	public static boolean isLength() {
		return false;
	}
	
	public static boolean isITStudent(String input, int len) {
		return input.length() == len;
	}
	
	public static boolean isITSubject(){
		return false;
	}
	
	public static void displayData() {
		
	}

}
