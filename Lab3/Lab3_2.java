import javax.swing.*;

public class Lab3_2 {
	public static void main(String[] args) {

		String email = JOptionPane.showInputDialog(null, "Input your e-mail: ").toLowerCase();

		while(email.indexOf("@") == 0 || email.contains(" ")) { email = JOptionPane.showInputDialog(null, "Input your e-mail, again: "); }

		String checkEmail = email.substring(email.indexOf("@") + 1); //บวกหนึ่ง = sub หลัง @ 

		if(checkEmail.equalsIgnoreCase("gmail.com") || checkEmail.equalsIgnoreCase("hotmail.com") ){
			JOptionPane.showMessageDialog(null, "Your e-mail is " + email);
		}else{
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
	}
}