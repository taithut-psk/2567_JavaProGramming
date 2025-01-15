import javax.swing.*;
public class Lab5_1 {

	public static void main(String[] args) {
		
		boolean checkItem = false;
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };

		int input = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter item number to order"));

		for(int i = 0; i < validValues.length; i++){
			if( validValues[i] == input ){
				System.out.println("Item " + input + " is " + String.format("%,.1f", price[i]));
				checkItem = true;
				break;
			}
		}

		if ( !checkItem ) System.out.println( "Invalid item" );
 
	}

}
