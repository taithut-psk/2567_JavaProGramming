
import java.util.*;

public class Lab3_3 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

        System.out.print("Input a sentence : ");
        String input = sc.nextLine();

        while(!input.endsWith(".")) {
            System.out.print("Input a sentence, again : ");
            input = sc.nextLine();
        }

        System.out.println();

        int lengthOfspace = input.replaceAll(" ", "").length();
        int spaceBar = input.length() - lengthOfspace;
        int word = input.split(" ").length;

        System.out.println("This sentence has " + spaceBar + " spacebar.\n" + 
        				   "This sentence has " + word + " word.");


        sc.close();

	}
}