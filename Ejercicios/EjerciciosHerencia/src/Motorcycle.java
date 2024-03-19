public class Motorcycle extends Vehicle {
    private int displacement;
    private int kilometersPerHour;
    public Motorcycle(int wheels, String colour, int displacement, int kilometersPerHour){
        super(wheels, colour);
        this.displacement = displacement;
        this.kilometersPerHour = kilometersPerHour;
    }

    public int getDisplacement() {
        return displacement;
    }

    public int getKilometersPerHour() {
        return kilometersPerHour;
    }
}
