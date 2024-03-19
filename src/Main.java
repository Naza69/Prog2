//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car ford = new Car(false, 4, 4, "Nazareno");
        Truck mercedes = new Truck(8, 2, "Nazareno", 120);

        ford.details();
        mercedes.details();

        System.out.println("El dueño del mercedes es: "+mercedes.getOwner());
        System.out.println("El dueño del ford es: "+ford.getOwner());

    }
}