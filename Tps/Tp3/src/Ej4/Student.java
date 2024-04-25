package Ej4;

public class Student {

    private int age;
    private String name;
    private double note;

    public Student(int age, String name, double note) {
        this.age = age;
        this.name = name;
        this.note = note;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(double note) {
        this.note = note;
    }


    public void infoStudent(){
        System.out.println("Nombre: " + this.name);
        System.out.println("Edad: " + this.age);
        System.out.println("Nota: " + this.note);
    }

}