public class Coffee extends Drink {

    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    Coffee(int type, char sizeCoffee, int typeCoffee, Barista barista) {
        super(type, ' ');
        this.typeCoffee = typeCoffee;
        this.sizeCoffee = Character.toUpperCase(sizeCoffee);
        this.barista = barista;
    }

    Coffee(int type, int typeCoffee) {

        this(type, ' ', typeCoffee, null);

    }

    Barista geBarista() {
        return barista;
    }

    String getTypeName() {

        return switch (typeCoffee) {
            case 1 -> "Americano";
            case 2 -> "Expresso";
            case 3 -> "Cappuccino";
            default -> null;
        };
    }

    int getTypePrice() {

        return switch (typeCoffee) {
            case 1 -> 50;
            case 2 -> 55;
            case 3 -> 65;
            default -> 0;
        };
    }

    String getSizeName() {

        return switch (sizeCoffee) {
            case 'S' -> "Short";
            case 'T' -> "Tall";
            case 'G' -> "Grande";
            case 'V' -> "Venti";
            default -> null;
        };
    }

    int getSizePrice() {

        return switch (sizeCoffee) {
            case 'S' -> 100;
            case 'T' -> 150;
            case 'G' -> 200;
            case 'V' -> 250;
            default -> 0;
        };
    }

    int getTotalPrice() {
        return super.getTypePrice() + getTypePrice() + getSizePrice();
    }

    public String toString() {
        return String.format("%s %s (%s) is %s baht",
                super.getTypeName(),
                getTypeName(),
                getSizeName(),
                getTotalPrice());
    }

}
