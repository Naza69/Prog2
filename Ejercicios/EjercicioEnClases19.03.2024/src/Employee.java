public abstract class Employee {
    private String name;
    public Employee(){
    }
    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ToString() {
        System.out.println("Nombre: "+getName());
        System.out.println("Este es un empleado de la empresa.");;
    }
}
