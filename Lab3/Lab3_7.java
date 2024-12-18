
import java.util.*;

public class Lab3_7 {
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

		System.out.print("Text: ");
        String input = sc.nextLine();

        String trimInput = input.replace(" ", "").toLowerCase(); //ลบช่องว่าง ทำให้เป็นตัวเล็ก
        String rearrangeInput = ""; //สำหรับเรียงข้อความใหม่
        
        //for ย้อนเรียงใหม่วุ้ยย
        for(int i = trimInput.length() - 1; i >= 0; i--) { rearrangeInput = rearrangeInput + trimInput.charAt(i);}

        System.out.println("It is " + 
        ((!trimInput.equals(rearrangeInput)) ? "not palindrome" : "palindrome"));

        sc.close();



	}
}