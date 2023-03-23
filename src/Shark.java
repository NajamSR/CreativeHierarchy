public class Shark extends Predator {
    private int teeth;

    public Shark(String name, String food, int teeth) {
        super(name, food);
        this.teeth = teeth;
    }

    public int getNumTeeth() {
        return teeth;
    }

    public void bite() {
        System.out.print("chomp ");
    }
}
