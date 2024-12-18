import java.util.*;

public class Lab3_6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Message : ");
        String input = sc.nextLine();

        if(input.toLowerCase().indexOf("nichi") >= 0 ) { System.out.println("Nichi is a sentence"); } 
        else { System.out.println(input); }

        sc.close();
	}
}