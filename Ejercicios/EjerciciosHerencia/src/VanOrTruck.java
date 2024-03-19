public class VanOrTruck extends Vehicle{
    private float load;
    public VanOrTruck(int wheels, String colour, float load){
        super(wheels, colour);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }
}
