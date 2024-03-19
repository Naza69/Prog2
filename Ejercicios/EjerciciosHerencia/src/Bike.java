public class Bike extends Vehicle{
    private String type;
    public Bike(int wheels, String colour, String type){
        super(wheels, colour);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
