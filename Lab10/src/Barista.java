public class Barista {

    private String name;
    private char gender;

    Barista(String name, char gender) {
        this.name = name;
        this.gender = Character.toUpperCase(gender);
    }

    Barista() {
        this(null, ' ');
    }

    String getName() {
        return name;
    }

    String getGenderName() {

        return switch (gender) {
            case 'M' -> "Male";
            case 'F' -> "Female";
            default -> " ";
        };

    }

    public String toString() {
        return getName() + " (" + getGenderName() + ")";
    }
}
