package Ej1;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class PuppetsStore {
    private int capacity;
    private Animal[] puppets;
    public PuppetsStore(){}
    public PuppetsStore(int capacity){
        this.capacity = capacity;
        this.puppets = new Animal[capacity];
        //for(int i = 0; i < puppets.length; i++){
        //    puppets[i] = new Ej1.Dog("Vacio", 0, "Vacio", 0, "Vacio", false);
        //}
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Animal[] getPuppets() {
        return puppets;
    }
    int position = 0;
    public void addAnimal(){
        Scanner sc = new Scanner(System.in);
        if(puppets.length > capacity){
            System.out.println("La tienda esta llena!");
        } else {
            String choice = "0";
            while (true) {
                try {
                    System.out.println("A continuacion, agrege el animal que quiera");
                    System.out.println("1) Perro");
                    System.out.println("2) Gato");
                    System.out.println("3) Ave");
                    System.out.println("4) Pez");
                    choice = sc.next();

                    if(!Objects.equals(choice, "1") && !Objects.equals(choice, "2") && !Objects.equals(choice, "3") && !Objects.equals(choice, "4")){
                        System.out.println("La opcion seleccionada no esta dentro de las dadas.");
                        continue;
                    }
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println("Introduzca un numero entero");
                    continue;
                }
                break;
            }
            while(true) {
                try{
                    if(choice.equals("1")) {
                        System.out.print("Introduzca su nombre: ");
                        String name = sc.next();
                        System.out.print("Introduzca su edad: ");
                        int age = sc.nextInt();
                        System.out.print("Introduzca su tipo: ");
                        String type = sc.next();
                        System.out.print("Introduzca su raza: ");
                        String breed = sc.next();
                        System.out.print("Introduzca su precio: ");
                        double price = sc.nextDouble();
                        System.out.print("Introduzca si esta vacunado o no: ");
                        String vacString = sc.next();
                        boolean vaccinated;
                        while(!vacString.toLowerCase().equals("si") && !vacString.toLowerCase().equals("no")){
                            System.out.println("Introduzca si o no");
                            vacString = sc.next();
                            if(!vacString.toLowerCase().equals("si") && !vacString.toLowerCase().equals("no")){
                                continue;
                            }else {
                                if(vacString.toLowerCase().equals("si")){
                                    vaccinated = true;
                                } else vaccinated = false;
                            };
                        }
                        if(vacString.toLowerCase().equals("si")){
                            vaccinated = true;
                        } else vaccinated = false;
                        for(int i = 0; i < puppets.length; i++){
                            if(puppets[i] == null){
                                puppets[i] = new Dog(name, age, type, price, breed, vaccinated);
                                break;
                            }
                        }
                    } else if (choice.equals("2")) {
                        System.out.print("Introduzca su nombre: ");
                        String name = sc.nextLine();
                        System.out.print("Introduzca su edad: ");
                        int age = sc.nextInt();
                        System.out.print("Introduzca su tipo: ");
                        String type = sc.next();
                        System.out.print("Introduzca su raza: ");
                        String breed = sc.next();
                        System.out.print("Introduzca su precio: ");
                        double price = sc.nextDouble();
                        System.out.print("Introduzca si esta vacunado o no: ");
                        String vacString = sc.next();
                        sc.nextLine();
                        boolean vaccinated;
                        while(true){
                            if(vacString.toLowerCase() == "si"){
                                vaccinated = true;
                            } else if (vacString.toLowerCase() == "no") {
                                vaccinated = false;
                            } else {
                                System.out.println("Introduzca si o no");
                                continue;
                            };
                            break;
                        }
                        for(int i = 0; i < puppets.length; i++){
                            if(puppets[i] == null){
                                puppets[i] = new Cat(name, age, type, price, breed, vaccinated);
                                break;
                            }
                        }
                    } else if (choice.equals("3")) {
                        System.out.print("Introduzca su nombre: ");
                        String name = sc.nextLine();
                        System.out.print("Introduzca su edad: ");
                        int age = sc.nextInt();
                        System.out.print("Introduzca su tipo: ");
                        String type = sc.next();
                        System.out.print("Introduzca su especie: ");
                        String species = sc.next();
                        System.out.print("Introduzca su precio: ");
                        double price = sc.nextDouble();
                        System.out.print("Introduzca si habla o no: ");
                        String canTalkString = sc.next();
                        boolean canTalk;
                        while(true){
                            if(canTalkString.toLowerCase() == "si"){
                                canTalk = true;
                            } else if (canTalkString.toLowerCase() == "no") {
                                canTalk = false;
                            } else {
                                System.out.println("Introduzca si o no");
                                continue;
                            };
                            break;
                        }
                        for(int i = 0; i < puppets.length; i++){
                            if(puppets[i] == null){
                                puppets[i] = new Fowl(name, age, type, price, species, canTalk);
                                break;
                            }
                        }
                    } else if(choice.equals("4")){
                        System.out.print("Introduzca su nombre: ");
                        String name = sc.nextLine();
                        System.out.print("Introduzca su edad: ");
                        int age = sc.nextInt();
                        System.out.print("Introduzca su tipo: ");
                        String type = sc.next();
                        System.out.print("Introduzca a que familia de peces pertenece: ");
                        String familiyOfFish = sc.next();
                        System.out.print("Introduzca su precio: ");
                        double price = sc.nextDouble();
                        System.out.print("Introduzca el tipo de agua al que pertenece: ");
                        String typeOfWaterString;
                        typeOfWaterString = sc.next();
                        String typeOfWater = "";
                            if(typeOfWaterString.toLowerCase().equals("dulce")){
                                typeOfWater = typeOfWaterString.toLowerCase();
                            } else if (typeOfWaterString.toLowerCase().equals("salada")) {
                                typeOfWater = typeOfWaterString.toLowerCase();
                            } else {
                                while(!typeOfWaterString.toLowerCase().equals("dulce") && !typeOfWaterString.toLowerCase().equals("salada")) {
                                    System.out.println("Tipo de agua invalida, introduzca salada o dulce");
                                    typeOfWaterString = sc.next();
                                    if(!typeOfWaterString.toLowerCase().equals("dulce") && !typeOfWaterString.toLowerCase().equals("salada")) {
                                        continue;
                                    } else {
                                        typeOfWater = typeOfWaterString.toLowerCase();
                                    }
                                }
                            };
                        for(int i = 0; i < puppets.length; i++){
                            if(puppets[i] == null){
                                puppets[i] = new Fish(name, age, type, price, familiyOfFish, typeOfWater);
                                break;
                            }
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Hubo un error en el input, porfavor, introduzca valores validos, sin espacios de mas.");
                    continue;
                }
                break;
            }
        }
    }
    public void addAnimal(Dog animalToAdd){
        if(puppets.length > capacity){
            System.out.println("La tienda esta llena!");
        } else {
            for(int i = 0; i < puppets.length; i++){
                if(puppets[i] == null){
                    puppets[i] = new Dog(animalToAdd.getName(), animalToAdd.getAge(), animalToAdd.getType(), animalToAdd.getPrice(), animalToAdd.getBreed(), animalToAdd.getStateVaccine());
                    break;
                }
            }
        }
        //if(puppets.length > capacity){
        //    System.out.println("La tienda esta llena!");
        //} else {
        //    puppets[position] = new Ej1.Dog(animalToAdd.getName(), animalToAdd.getAge(), animalToAdd.getType(), animalToAdd.getPrice(), animalToAdd.getBreed(), animalToAdd.getStateVaccine());
        //    position++;
        //}
    }
    public void addAnimal(Cat animalToAdd){
        if(puppets.length > capacity){
            System.out.println("La tienda esta llena!");
        } else {
            for(int i = 0; i < puppets.length; i++){
                if(puppets[i] == null){
                    puppets[i] = new Cat(animalToAdd.getName(), animalToAdd.getAge(), animalToAdd.getType(), animalToAdd.getPrice(), animalToAdd.getBreed(), animalToAdd.getStateVaccine());
                    break;
                }
            }
        }
    }
    public void addAnimal(Fowl animalToAdd){
        if(puppets.length > capacity){
            System.out.println("La tienda esta llena!");
        } else {
            for(int i = 0; i < puppets.length; i++){
                if(puppets[i] == null){
                    puppets[i] = new Fowl(animalToAdd.getName(), animalToAdd.getAge(), animalToAdd.getType(), animalToAdd.getPrice(), animalToAdd.getSpecies(), animalToAdd.canTalkState());
                    break;
                }
            }
        }
    }
    public void addAnimal(Fish animalToAdd){
        if(puppets.length > capacity){
            System.out.println("La tienda esta llena!");
        } else {
            for(int i = 0; i < puppets.length; i++){
                if(puppets[i] == null){
                    puppets[i] = new Fish(animalToAdd.getName(), animalToAdd.getAge(), animalToAdd.getType(), animalToAdd.getPrice(), animalToAdd.getFamilyOfFish(), animalToAdd.getTypeOfWater());
                    break;
                }
            }
        }
    }
    public void sellAnimal(String nameAnimalToSell){
        int counter = 0;
        for(int i = 0; i<puppets.length;i++){
            try{
                if(nameAnimalToSell.toLowerCase().equals(puppets[i].getName().toLowerCase()) && puppets[i] != null){
                    System.out.println("Ha vendido el animal: "+puppets[i].getName()+" por "+puppets[i].getPrice());
                    counter++;
                    puppets[i] = null;
                }
            } catch (NullPointerException e) {}
        }
        if (counter == 0){
            System.out.println("Ese animal no esta en la lista");
        }
    }
    public void feedAnimal(String animalToFeed){
        int counter = 0;
        for(int i = 0; i<puppets.length;i++){
            try{
                if(animalToFeed.toLowerCase().equals(puppets[i].getName().toLowerCase()) && puppets[i] != null){
                    System.out.println("Ha alimentado al animal: "+puppets[i].getName());
                    counter++;
                    break;
                }
            } catch (NullPointerException e){}
        }
        if (counter == 0){
            System.out.println("Ese animal no esta en la lista");
        }
    }
    public void listAllAnimals(){
        for(int i = 0; i < puppets.length; i++){
            if(puppets[i] != null){
                System.out.println("Ej1.Animal Nro: "+i);
                System.out.println(puppets[i].toString());
            } else continue;
        }
    }
}