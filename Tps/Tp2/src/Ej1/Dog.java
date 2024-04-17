package Ej1;

public class Dog extends Animal {
    private String breed;
    private boolean vaccinated;

    public Dog(){}

    public Dog(String name, int age, String type, double price, String breed, boolean vaccinated){
        super(name, age, type, price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }
    public void isVaccinated(){
        if(vaccinated){
            System.out.println("Esta vacunado");
        } else {
            System.out.println("No esta vacunado");
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
    public boolean getStateVaccine(){
        return vaccinated;
    }
    @Override
    public String toString(){
        return "Nombre: "+getName()+"\n"+"Edad: "+getAge()+"\n"+"Tipo: "+getType()+"\n"+"Precio: "+getPrice()+"\n"+"Raza: "+getBreed()+"\n"+"Vacunado: "+vaccinated;
    }

}
