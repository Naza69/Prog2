package Ej2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mauro");
        Employee e2 = new Employee("Juan Ignacio", e1);
        Employee e3 = new Employee("Nicolas");

        e2.getSupervisorName();
        e1.getSupervisorName();
        e3.asigneSupervisor(e1);
        e3.getSupervisorName();
        e2.asigneSupervisor(e3);
    }
}
