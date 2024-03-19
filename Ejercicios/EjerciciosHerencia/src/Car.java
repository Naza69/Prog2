public class Car extends Vehicle {
    private int displacement;
    private int kilometersPerHour;
    public Car(int wheels, String colour, int displacement, int kilometersPerHour){
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

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setKilometersPerHour(int kilometersPerHour) {
        this.kilometersPerHour = kilometersPerHour;
    }

}
