import javax.swing.*;
public class Lab5_8 {
	public static void main(String[] args) {
		int[] nums = { 25, 78, 41, 22, 36, 85, 37 };

		int index = Integer.parseInt( JOptionPane.showInputDialog(null, "Input index of array") );

		while (!checkIndex(nums, index)) { index = Integer.parseInt( JOptionPane.showInputDialog(null, "Input index of array, again") ); }

		String output = "Current data, nums[" + index + "] is " + currentData(nums, index) + "\n";

		output += (checkIndex(nums, index - 1) ? "Previous data, nums[" + (index - 1 ) + "] is " + prevData(nums, index) + 
		"\n" : "No Previous data\n") +
				  (checkIndex(nums, index + 1) ? "Next data, nums[" + (index + 1 ) + "] is " + nextData(nums, index) + 
		"\n" : "No Next data\n"); 

		JOptionPane.showMessageDialog(null, output);
	}

	public static boolean checkIndex(int[] nums, int index) { return ( index < nums.length ) && ( index >= 0); }

	public static int currentData(int[] nums, int index) { return nums[index]; }

	public static int prevData(int[] nums, int index) { return nums[index - 1]; }

	public static int nextData(int[] nums, int index) { return nums[index + 1]; }

}
