public class Drink {

    private int type;
    private char size;

    Drink(int type, char size) {
        this.type = type;
        this.size = size;
    }

    Drink() {

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
            case 1 -> "asdas";
            case 2 -> "asdasd";
            default -> 0;
        };
    }

    String getSizeName() {
        return switch (size) {
            case 'S' -> 15;
            case 'M' -> 15;
            case 'L' -> 25;
            default -> 0;
        };
    }

    int getSizePrice() {
        return null;
    }

    int getTotalPrice() {
        return null;
    }
}
