public class Director {

    private String name;
    private String email;
    private char gender;

    Director(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    Director(String name, String email) {

        this(name, email, 'm');

    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getGenderName() {
        if (Character.toUpperCase(gender) == 'M')
            return "Male";
        else if (Character.toUpperCase(gender) == 'F')
            return "Female";
        else
            return null;
    }

    public String toString() {
        return getName() + getEmail() + getGenderName();
    }

}
