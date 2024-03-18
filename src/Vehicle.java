import java.util.Vector;

public abstract class Vehicle {
    private int wheels;
    private int doors;
    private String owner;
    public Vehicle(){

    }
    public Vehicle(int wheels, int doors, String owner){
        this.wheels = wheels;
        this.doors = doors;
        this.owner = owner;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getOwner() {
        return owner;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public void details(){
        System.out.println("Numero de puertas: "+getDoors()+"\n"+"Numero de ruedas: "+getWheels()+"\n"+"Dueño: "+getOwner());
    }
}
