public class Employee {
    private String position;
    private String name;
    public Employee(String position, String name){
        this.position = position;
        this.name = name;
    }
    public Employee(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}

