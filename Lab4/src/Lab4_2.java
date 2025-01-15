import javax.swing.*;
public class Lab4_2 {

	public static void main(String[] args) {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year: "));
		
		while(!checkYear(year)) { year = Integer.parseInt(JOptionPane.showInputDialog(null, "Input year: ")); }
		
		JOptionPane.showMessageDialog(null, (isLeapYear(year)) ? year + " is Leap Year"  : year + " is NOT Leap year");
	}
	
	public static boolean isLeapYear(int year) { return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0); } 
	
	public static boolean checkYear(int year) { return (year >= 1000 && year <= 3000 ); }
}
