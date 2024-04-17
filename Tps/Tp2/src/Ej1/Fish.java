package Ej1;

public class Fish extends Animal {
    private String familyOfFish;
    private String typeOfWater;
    public Fish(){}
    public Fish(String name, int age, String type, double price, String familyOfFish, String typeOfWater){
        super(name, age, type, price);
        this.familyOfFish = familyOfFish;
        this.typeOfWater = typeOfWater;
    }

    public String getFamilyOfFish() {
        return familyOfFish;
    }

    public void setFamilyOfFish(String familyOfFish) {
        this.familyOfFish = familyOfFish;
    }

    public String getTypeOfWater() {
        return typeOfWater;
    }

    public void setTypeOfWater(String typeOfWater) {
        this.typeOfWater = typeOfWater;
    }
    @Override
    public String toString(){
        return "Nombre: "+getName()+"\n"+"Edad: "+getAge()+"\n"+"Tipo: "+getType()+"\n"+"Precio: "+getPrice()+"\n"+"Familia de origen: "+getFamilyOfFish()+"\n"+"De agua: "+getTypeOfWater();
    }
}
