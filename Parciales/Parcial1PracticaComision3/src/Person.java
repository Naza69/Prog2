//Clase abstracta persona

public class Person {
    //Atributos iniciales
    private int dni;
    private String name;
    //Constructor
    public Person(int dni, String name){
        this.dni = dni;
        this.name = name;
    }
    //Constructor vacio
    public Person(){}

    //Getters
    public String getName() {
        return name;
    }

    public int getDni() {
        return dni;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
