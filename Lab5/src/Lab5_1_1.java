import javax.swing.*;
public class Lab5_1_1 {

	public static void main(String[] args) {

		boolean checkName = false;
		String[] deptName = { "Accounting", "HR", "Sales", "Innovation"};

		String input = JOptionPane.showInputDialog(null, "Enter a department name");

		for(int i = 0; i < deptName.length; i++){
			if ( deptName[i].equalsIgnoreCase(input) ){
				JOptionPane.showMessageDialog(null, input + " was found in the list");
				checkName= true;
				break;
			}
		}

		 if ( !checkName ) JOptionPane.showMessageDialog( null, input + " was not found in the list") ;
	}

}
