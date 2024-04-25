package Ej1;

public abstract class Person {
    private int dni;
    private String name;
    public Person(int dni, String name){
        this.dni = dni;
        this.name = name;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

}
