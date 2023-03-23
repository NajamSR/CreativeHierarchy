public class Predator {
    private String name;
    private String food;

    public Predator(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public void eat() {
        System.out.println("Mmm, " + getFood() + "! My favorite!");
    }
}
