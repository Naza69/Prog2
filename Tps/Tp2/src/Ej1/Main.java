package Ej1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PuppetsStore tienda = new PuppetsStore(3);
        //tienda.addAnimal();
        tienda.addAnimal(new Cat("Mishu", 2, "Pequeño", 400000, "Siames", true));
        tienda.sellAnimal("Mishu");
        tienda.addAnimal(new Dog("Bethoven", 5, "Grande", 900000, "San Bernardo", true));
        tienda.feedAnimal("Bethoven");
        tienda.listAllAnimals();
        tienda.addAnimal(new Cat("Mishi", 2, "Pequeño", 400000, "Siames", true));
        tienda.feedAnimal("Bethoven");
        tienda.feedAnimal("Nose");
        tienda.listAllAnimals();
        tienda.addAnimal();
        tienda.listAllAnimals();
        }
    }