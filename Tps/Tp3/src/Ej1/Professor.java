package Ej1;

public class Professor extends Person {
    private int dni;
    private String name;
    private Subject section;
    private Subject[] sections;
    public Professor(){}
    public Professor(int dni, String name, Subject section){
        this.dni = dni;
        this.name = name;
        this.section = new Subject();

    }
    public Professor(int dni, String name, Subject[] sections){
        this.dni = dni;
        this.name = name;
        this.sections = sections;

    }
    public Subject getSection() {
        return section;
    }


    public void setSection(Subject section) {
        this.section = section;
    }

    public void teach(){
        System.out.println("El profe enseña.");
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void showClassRoom(){
        System.out.println("El aula es: "+section.getClassroom());
    }

    public void showSubjects(){
        for(int i = 0; i < sections.length; i++){
            System.out.println("Asignatura "+i+": "+sections[i].getName());
        }
    }

    public void showGroupStudentsBySection(int numberOfSection){
        for(int i = 0; i < sections.length; i++){
            if(i+1 == numberOfSection){
                sections[i].showStudentsData();
            }
        }
    }
}
