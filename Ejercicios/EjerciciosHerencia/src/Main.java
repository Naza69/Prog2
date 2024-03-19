import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Vehicle[] vehicles = new Vehicle[4]; //Array de vechiculos
        //Creacion de los objetos del array
        vehicles[0] = new Motorcycle(2, "gray", 660, 195);
        vehicles[1] = new Bike(2, "orange", "allterrain");
        vehicles[2] = new Car(4, "white", 2, 275);
        vehicles[3] = new VanOrTruck(4, "black", 120);
        functions fun = new functions();
        //Funcion para catalogar
        fun.catalog(vehicles);
        fun.catalog(0, vehicles);
        fun.catalog(2, vehicles);
        fun.catalog(4, vehicles);
        //Ejercicio 2
        //Creacion de objetos
        Cat michu = new Cat("Diogenes", 4, "Macho", "Atigrado", "Voluminoso");
        Dog picho = new Dog("Dede", 2, "Macho", "Husky Siberiano", "Medio");
        Bird bicho = new Bird("Merlin", 7, "Macho", "Cuervo", "NegroRasposo");
        //Metodo info
        michu.info();
        picho.info();
        bicho.info();
        //Metodos heredados
        michu.makeSound();
        michu.tongueShower();

        picho.makeSound();
        picho.tongueShower();

        bicho.makeSound();
        bicho.tongueShower();

        //Metodos nativos
        michu.hairBall();
        michu.laser();

        picho.givePaw();
        picho.bark();

        bicho.fly();
        bicho.stealSomething("pedazo de pan");
    }
}
class functions {

    public void catalog(Vehicle[] toCatalog) {
        for (int i = 0; i < toCatalog.length; i++) {
            if (toCatalog[i] instanceof Motorcycle) {
                System.out.println("Es de clase motocicleta" + "\n"
                        + "Ruedas: " + toCatalog[i].getWheels() + "\n"
                        + "Color: " + toCatalog[i].getColour() + "\n" +
                        "Cilindrada: " + ((Motorcycle) toCatalog[i]).getDisplacement() + "\n" +
                        "Velocidad Maxima: " + ((Motorcycle) toCatalog[i]).getKilometersPerHour());
            } else if (toCatalog[i] instanceof Car) {
                System.out.println("Es de clase auto" + "\n"
                        + "Ruedas: " + toCatalog[i].getWheels() + "\n"
                        + "Color: " + toCatalog[i].getColour() + "\n" +
                        "Cilindrada: " + ((Car) toCatalog[i]).getDisplacement() + "\n" +
                        "Velocidad Maxima: " + ((Car) toCatalog[i]).getKilometersPerHour());
            } else if (toCatalog[i] instanceof VanOrTruck) {
                System.out.println("Es de clase Camioneta" + "\n"
                        + "Ruedas: " + toCatalog[i].getWheels() + "\n"
                        + "Color: " + toCatalog[i].getColour() + "\n" +
                        "Carga: " + ((VanOrTruck) toCatalog[i]).getLoad() + "kg.");
            } else if (toCatalog[i] instanceof Bike) {
                System.out.println("Es de clase bicicleta" + "\n"
                        + "Ruedas: " + toCatalog[i].getWheels() + "\n"
                        + "Color: " + toCatalog[i].getColour() + "\n" +
                        "Tipo de bici: " + ((Bike) toCatalog[i]).getType());
            }
        }
    }

    public void catalog(int wheels, Vehicle[] toCatalog) {
        int counterInstances = 0;
        for (int i = 0; i < toCatalog.length; i++) {
            if (toCatalog[i].getWheels() == wheels) {
                counterInstances++;
            }
        }
        if (counterInstances == 2) {
            System.out.println("Son las ruedas de una motocicleta/bicicleta.");
        } else if (counterInstances == 4) {
            System.out.println("Son las ruedas de una camioneta, o auto.");
        }
        System.out.println("Se han encontrado " + counterInstances + " vehiculos con " + wheels + " ruedas.");
    }
}
