public class FictionBook implements Author, Book {

    private String author_name;
    private String email;
    private String title;
    private int publicYear;
    private String fname;
    private String lname;

    FictionBook(String title, int publicYear) {
        this.title = title;
        this.publicYear = publicYear;
    }

    void setAuthorName(String name) {
        author_name = name;
        int space = author_name.indexOf(" ");
        fname = author_name.substring(0, space);
        lname = author_name.substring(space + 1);
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getEmail() {
        return this.email;
    }

    @Override
    String getLasname() {
        return this.lname.toUpperCase();
    }

    @Override
    public String getFirstname() {
        return this.fname.toUpperCase();
    }

    @Override
    public boolean checkEmail() {
        return (this.email.endsWith("@hotmail.com")) ? true : false;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int totalPublicYear() {
        return 2025 - this.publicYear;
    }

    public String toString() {
        return String.format("%s writen by %s %s (%s)/publisher for %s year(s).", getLastname().substring(0, 1),
                getFirstname(), getEmail(), totalPublicYear());
    }

}
