
import java.util.*;

public class Lab3_1 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String input_Upper = "";
	
	while(true){

		System.out.print("Enter word: ");
		String input = sc.next();
		
		if(input.equalsIgnoreCase("stop")){ /*ปรียบเทียบ input ไม่สนตัวเล็ก ตัวใหญ่ หน้าไหน แล้วเบรคเลย*/ break;}

		input_Upper += input.toUpperCase() + " ";
	}

	System.out.println(input_Upper);



	sc.close();
	}
}