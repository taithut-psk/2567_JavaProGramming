import javax.swing.*;

public class Lab203 {
    public static void main(String[] args) {
        final double weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your weight"));
        final double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your height")) / 100;
        final double BMI = weight / (height * height);

        String body;
        if (BMI < 18.5) {
            body = "Under-Weight";
        } else if (BMI < 24.9) {
            body = "Normal-Weight";
        } else if (BMI < 29.9) {
            body = "Over-Weight";
        } else {
            body = "Obesity";
        }

        JOptionPane.showMessageDialog(null,
                "BMI = " + String.format("%,.2f", BMI) +
                "\nYou're " + body, "BMI"
                , JOptionPane.WARNING_MESSAGE);
    }
}