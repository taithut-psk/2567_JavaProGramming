
import java.util.*;

public class Lab3_4 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

		System.out.print("Full Name: ");
        String fullName = sc.nextLine();

        if(fullName.indexOf(" ") <= 0) { System.out.println("Incorrect Name"); } 
        else{ 

        	String trimFirstName = fullName.substring(0, fullName.indexOf(" ")); //n0 ถึงช่องว่าง
            String trimLastName = fullName.substring(fullName.indexOf(" ") + 1); //+1 หลังช่องว่าง
        	
        	System.out.println("First Name: " +  
            trimFirstName.toUpperCase() + "\nLast Name: " + 
            trimLastName.toLowerCase());
        }

        sc.close();
	}
}