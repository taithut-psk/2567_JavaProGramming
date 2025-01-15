import java.util.*;
public class Lab4_4 {

	public static void main(String[] args) { inputStudent(); }
	
	public static void inputStudent() {
		
		Scanner input = new Scanner(System.in);
		String studentID = "", subjectCode = "";
		
		while(!isLength(studentID, 10)) {
			System.out.print("Enter Student ID: ");
			studentID = input.nextLine();
		}
		
		while(!isLength(subjectCode, 7)) {
			System.out.print("Enter Subject ID: ");
			subjectCode = input.nextLine();
		}
		
		input.close();
		displayData(isITStudent(studentID), isITSubject(subjectCode), studentID);

	}
	
	public static boolean isLength(String stdId, int lenght) {
		return ( stdId.length() == lenght ) ? true : false ;
	}
	
	public static boolean isITStudent(String stdId) {
		return ( stdId.charAt(2) == '1' && stdId.substring(3, 6).equals("311") ) ? true : false ;
	}
	
	public static boolean isITSubject(String subJCode){
		return ( subJCode.startsWith("21") && subJCode.charAt(4) == '1' ) ? true : false ;
	}
	
	public static void displayData(boolean std, boolean subJ, String stdId) {
		
		System.out.print("\nStudent id: " + stdId + " " +
							   ((!std) ? "is not " : "") + "1st year student in IT\n" +
							   ((!subJ) ? "not e" : "E") +  "nroll in courses for Year 1\n");
	}
}
