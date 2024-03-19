import java.sql.SQLOutput;

public class Cat extends Animal {
    private String colour;
    private String typeOfFur;
    public Cat(){}
    public Cat(String name, int age, String gender, String colour, String typeOfFur){
        super(name, age, gender);
        this.colour = colour;
        this.typeOfFur = typeOfFur;
    }

    public String getColour() {
        return colour;
    }

    public String getTypeOfFur() {
        return typeOfFur;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setTypeOfFur(String typeOfFur) {
        this.typeOfFur = typeOfFur;
    }
    //Metodos heredados
    @Override
    public void makeSound() {
        System.out.println("El gato maulla...");
    }

    @Override
    public void tongueShower() {
        System.out.println("El gato se da un baño con la lengua...");
    }
    //Metodos nativos
    public void hairBall(){
        System.out.println("El gato vomito una bola de pelo.");
    }
    public void laser(){
        System.out.println("El gato se ha puesto a perseguir un laser.");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Color: "+getColour());
        System.out.println("Tipo de pelaje: "+getTypeOfFur());
    }
}
