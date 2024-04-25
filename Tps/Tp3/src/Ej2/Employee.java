package Ej2;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Employee supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void asigneSupervisor(Employee supervisor){
        if (this.supervisor == null){
            setSupervisor(supervisor);
        }else {
            System.out.println("El empleado ya tiene un supervisor");
        }
    }


    public void getSupervisorName(){
        if (supervisor == null){
            System.out.println("El empleado no tiene supervisor");
        }else {
            System.out.println("Supervisor: " + this.supervisor.getName());
        }
    }
}
