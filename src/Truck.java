public class Truck extends Vehicle {
    private float load;
    public Truck(int wheels, int doors, String owner, float load){
        super(wheels, doors, owner);
        this.load = load;
    }
    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    @Override
    public void details() {
        super.details();
    }
}
