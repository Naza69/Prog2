public abstract class Vehicle {
    private int wheels;
    private String colour;
    public Vehicle(int wheels, String colour){
        this.wheels = wheels;
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColour() {
        return colour;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
