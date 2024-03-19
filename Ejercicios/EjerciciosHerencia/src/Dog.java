public class Dog extends Animal {
    private String breed;
    private String size;
    public Dog(){}
    public Dog(String name, int age, String gender, String breed, String size){
        super(name, age, gender);
        this.breed = breed;
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    //Metodos nativos
    public void bark(){
        System.out.println("Guau! Guau! Guau! Guau!");
    }
    public void givePaw(){{
        System.out.println("El perro te da la pata.");}
    }
    //Metodos heredados
    @Override
    public void makeSound() {
        System.out.println("El perro aulla...");
    }
    @Override
    public void tongueShower() {
        System.out.println("El perro se da un baño con la lengua...");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Raza: "+getBreed());
        System.out.println("Tamaño: "+getSize());
    }
}
