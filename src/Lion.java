public class Lion extends Predator {
    private double maneLength;

    public Lion(String name, String food, double len) {
        super(name, food);
        maneLength = len;
    }

    public double getManeLength() {
        return maneLength;
    }

    public void roar() {
        System.out.println("Raawrrrr");
    }
}
