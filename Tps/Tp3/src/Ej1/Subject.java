package Ej1;

public class Subject {
    private int classroom;
    private String classTime;
    private String name;
    private Group studentsAsigned;
    private Professor professor;

    public Subject(){}

    public Subject(int classroom, String classTime, String name){
        this.classroom = classroom;
        this.classTime = classTime;
        this.name = name;
    }
    public Subject(int classroom, String classTime, String name, Professor professor){
        this.classroom = classroom;
        this.classTime = classTime;
        this.name = name;
        this.professor = professor;
    }

    public Subject(int classroom, String classTime, String name, Group studentsAsigned){
        this.classroom = classroom;
        this.classTime = classTime;
        this.name = name;
        this.studentsAsigned = studentsAsigned;
    }

    public String getName() {
        return name;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public void showStudentsData(){
        for(int i = 0; i < studentsAsigned.getMembers().length; i++){
            System.out.println("Alumno "+i);
            System.out.println("DNI: "+studentsAsigned.getMembers()[i].getDni());
            System.out.println("Nombre: "+studentsAsigned.getMembers()[i].getName());
        }
    }
    public void showProfessorAsigned(){
        System.out.println("Profesor asignado a esta asignatura: "+professor.getName());
    }



}
