class Main {
    public static void main(String[] args) {
        Predator pred = new Predator("Jack", "people");
        System.out.println("Name: " + pred.getName());
        System.out.println("Main Course: " + pred.getFood());
        pred.eat();
        System.out.println();
        Shark white = new Shark("Derek", "turtles", 40);
        System.out.println("Name: " + white.getName());
        System.out.println("Main Course: " + white.getFood());
        System.out.println("Amount of Teeth: " + white.getNumTeeth());
        white.bite();
        white.eat();
        System.out.println();
        Lion cat = new Lion("Leo", "zebras", 26.5);
        System.out.println("Name: " + cat.getName());
        System.out.println("Main Course: " + cat.getFood());
        System.out.println("Mane Length: " + cat.getManeLength());
        cat.eat();
        cat.roar();
    }
}
