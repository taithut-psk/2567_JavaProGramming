public class Drink {

    private int type;
    private char size;

    Drink(int type, char size) {
        this.type = type;
        this.size = Charactor.toUpperCase(size);
    }

    Drink() {
        this(0, ' ');
    }

    String getTypeName() {

        return switch (type) {
            case 1 -> "Hot";
            case 2 -> "Cold";
            default -> null;
        };
    }

    int getTypePrice() {

        return switch (type) {
            case 1 -> 10;
            case 2 -> 20;
            default -> 0;
        };
    }

    String getSizeName() {

        return switch (size) {
            case 'S' -> "Small";
            case 'M' -> "Medium";
            case 'L' -> "Large";
            default -> null;
        };
    }

    int getSizePrice() {

        return switch (size) {
            case 'S' -> 15;
            case 'M' -> 20;
            case 'L' -> 25;
            default -> 0;
        };
    }

    int getTotalPrice() {
        return getTypePrice() + getSizePrice();
    }
}
