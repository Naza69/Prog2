package Ej1;

import java.util.Objects;

public class Student extends Person {
    private int dni;
    private String name;
    private Group workGroup;
    private Group[] workGroups;
    private Subject section;
    private Subject[] sections;

    public Student(){}
    public Student(int dni, String name){
        this.dni = dni;
        this.name = name;
    }

    public Student(int dni, String name, Group workGroup ){
        this.dni = dni;
        this.name = name;
        this.workGroup = workGroup;
    }

    public Student(int dni, String name, Group[] workGroups){
        this.dni = dni;
        this.name = name;
        this.workGroups = workGroups;
    }

    public Student(int dni, String name, Subject section){
        this.dni = dni;
        this.name = name;
        this.section = section;
    }

    public Student(int dni, String name, Subject[] sections){
        this.dni = dni;
        this.name = name;
        this.sections = sections;
    }

    public void learn(){
        System.out.println("El alumno aprende");
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
    public void showLetterGroup(){
        for(int i = 0; i < workGroups.length;i++){
            System.out.println("Grupo: "+workGroups[i].getLetter());
        }
    }
    public void showLetterGroup(int letterPositionGroup){
        for(int i = 0; i < workGroups.length;i++){
            if(letterPositionGroup == i+1){
                System.out.println("Letra del grupo N°"+i+" al que pertenece: "+workGroups[i].getLetter());
            }
        }
    }

    public void showGroupSections(int numberGroupShowSections){
        for(int i = 0; i < workGroups.length; i++){
            if(i+1 == numberGroupShowSections){
                workGroups[i].showSections();
            }
        }
    }
    public void showProfessorBySection(String sectionName){
        for(int i = 0; i < sections.length; i++){
            if(Objects.equals(sectionName.toLowerCase(), sections[i].getName().toLowerCase())){
                System.out.println();
            } else System.out.println("Esta asignatura no existe");
        }
    }
}
