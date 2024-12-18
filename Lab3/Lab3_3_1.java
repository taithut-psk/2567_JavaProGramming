import javax.swing.*;

public class Lab3_3_1 {
        public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null, "Input a sentence :");

        while(!input.endsWith(".")) { input = JOptionPane.showInputDialog(null, "Input a sentence, again :"); }

        System.out.println();

        int lengthOfspace = input.replaceAll(" ", "").length();
        int spaceBar = input.length() - lengthOfspace;
        int word = input.split(" ").length;

        JOptionPane.showMessageDialog(null, "This sentence has " + 
        							 spaceBar + " spacebar.\n" + "This sentence has " + 
        							 word + " word.");
        }
}