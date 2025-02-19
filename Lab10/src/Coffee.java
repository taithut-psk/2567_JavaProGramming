public class Coffee {

    private int typeCoffee;
    private char sizeCoffee;
    private Barista barista;

    Cofee(int typeCoffee, char sizeCoffee, Barista barista){

        this.typeCoffee = typeCoffee;
        this.sizeCoffee = sizeCoffee;
        this.barista = barista;

    }

    Cofee(int type, int typeCoffee){

        this.typeCoffee = typeCoffee;

    }

    Barista geBarista() {
        return barista;
    }

    String getTypeName() {
        return null;
    }

}
