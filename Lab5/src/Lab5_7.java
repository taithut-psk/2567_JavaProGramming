import javax.swing.*;
public class Lab5_7 {

	public static void main(String[] args) {
		
		int[] number = new int[5];

		for(int i = 0; i < number.length; i++){
			number[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Input number " + (i+1) ));
		}

		showEven(number);
		showOdd(number);

	}

	public static void showEven(int[] numbers){
		String output = "List of even number :\n";
		for(int numbers_ : numbers){
			if ( ( numbers_ % 2 ) == 0 ) output += numbers_ + " "; 
		}

		JOptionPane.showMessageDialog(null, output);

	}

	public static void showOdd(int[] numbers){
		String output = "List of odd number :\n";
		for(int numbers_ : numbers){
			if ( ( numbers_ % 2 ) != 0 ) output += numbers_ + " "; 
		}

		JOptionPane.showMessageDialog(null, output);
	}

}
