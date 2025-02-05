public class Theater extends Movie {

    private int theaterNo;

    Theater(String id, String name, Director director, int theaterNo) {

        super(id, name, director);
        this.theaterNo = theaterNo;
    }

    Theater() {

    }

    public String getTheaterName() {
        return null;
    }

    public String toString() {
        return super.toString();
    }
}
