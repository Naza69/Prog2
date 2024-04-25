package Ej1;

public class Group {
    private String course;
    private char letter;
    private Student[] members;
    private Subject[] section;
    public Group(String course, char letter, Student[] members){
        this.course = course;
        this.letter = letter;
        this.members = members;
    }
    public Group(String course, char letter, Student[] members, Subject[] section){
        this.course = course;
        this.letter = letter;
        this.members = members;
        this.section = section;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student[] getMembers() {
        return members;
    }

    public void setMembers(Student[] members) {
        this.members = members;
    }

    public void showSections(){
        for(int i = 0; i < section.length; i++){
            System.out.println("Asignatura "+i+" :"+section[i].getName());
        }
    }

}
