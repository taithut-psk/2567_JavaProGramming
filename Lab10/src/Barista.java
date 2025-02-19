public class Barista {

    private String name;
    private char gender;

    Barista(String name, char gender) {
        this.name = name;
        this.gender = gender;
    }

    Barista() {
    }

    String getName() {
        return name;
    }

    String getGenderName() {
        if (gender == 'M')
            return "Male";
        if (gender == 'F')
            return "Female";
        return " ";
    }
}
