import javax.swing.*;

public class CoffeeShopDemo {

    public static void main(String[] args) {
        Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        int drinkType = Integer.parseInt(JOptionPane.showInputDialog(null, "Drink Type"));
        int coffeeType = Integer.parseInt(JOptionPane.showInputDialog(null, "Coffee Type"));
        char coffeeSize = JOptionPane.showInputDialog(null, "Coffee Size").toLowerCase().charAt(0);
        int baristaNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Barista number"));

        Barista barista = switch (baristaNumber) {
            case 1 -> staff1;
            case 2 -> staff2;
            default -> staff1;
        };

        Coffee order = new Coffee(drinkType, coffeeSize, coffeeType, barista);
        JOptionPane.showMessageDialog(null, order +
                "\nBarista: " + barista);
    }
}
