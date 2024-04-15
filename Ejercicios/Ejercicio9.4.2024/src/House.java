public class House {
    private Door[] doors;
    public House(Door[] doors){
        this.doors = doors;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

}