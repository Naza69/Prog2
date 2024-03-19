public class Car extends Vehicle {
    private boolean despotable;
    public Car(){

    }
    public Car(boolean despotable, int wheels, int doors, String owner){
        super(wheels, doors, owner);
        this.despotable = despotable;
    }

    public boolean isDespotable() {
        return despotable;
    }
    public void details() {
        super.details();
    }
}
