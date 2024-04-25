package Ej1;

public class Main {
    public static void main(String[] args) {

        //II
        Student alumn1 = new Student(52324456, "Marco Fioretti");
        Student alumn2 = new Student(54234987, "Estefania Garzia");
        Student alumn3 = new Student(53765890, "Clara Geier");
        Student[] alumnado1 = new Student[3];
        alumnado1[0] = alumn1;
        alumnado1[1] = alumn2;
        alumnado1[2] = alumn3;
        Subject math = new Subject(4, "10:30/12:30", "Matematica");
        Professor profe1 = new Professor(32321232, "Rodrigo Zapata", math);
        Group grupo1 = new Group("D1", 'B', alumnado1);
        //III a
        profe1.showClassRoom();
        Subject biology = new Subject(5, "8:00/12:30", "Biologia");
        Subject history = new Subject(8, "10:30/12:30", "Historia");
        Subject physics = new Subject(7, "8:00/11:00", "Fisica", profe1);
        Subject[] asignaturas1 = new Subject[3];
        asignaturas1[0] = biology;
        asignaturas1[1] = history;
        asignaturas1[2] = physics;
        Professor profe2 = new Professor(35324567, "Rodolfo Velasco", asignaturas1);
        //III b
        profe2.showSubjects();
        Subject whatever = new Subject(3, "14:00/16:00", "Loquesea", grupo1);
        //III c
        whatever.showStudentsData();
        Student alumn4 = new Student(58764908, "Leonardo Fioretti");
        Student alumn5 = new Student(55678432, "Leticia Garzia");
        Student alumn6 = new Student(53765890, "Pricila Geier");
        Student[] alumnado2 = new Student[3];
        alumnado2[0] = alumn4;
        alumnado2[1] = alumn5;
        alumnado2[2] = alumn6;
        Group grupo2 = new Group("E3", 'F', alumnado2);
        Student alumn7 = new Student(55643788, "Luz Fioretti");
        Student alumn8 = new Student(54786312, "Nacho Garzia");
        Student alumn9 = new Student(51876543, "Juan Geier");
        Student[] alumnado3 = new Student[3];
        alumnado3[0] = alumn7;
        alumnado3[1] = alumn8;
        alumnado3[2] = alumn9;
        Group grupo3 = new Group("A2", 'N', alumnado3);
        Group[] grupos1 = new Group[3];
        grupos1[0] = grupo1;
        grupos1[1] = grupo2;
        grupos1[2] = grupo3;
        Student alumn10 = new Student(5436213, "John Wick", grupos1);
        //III d
        alumn10.showLetterGroup(3);
        Subject[] asignaturas2 = new Subject[3];
        asignaturas2[0] = whatever;
        asignaturas2[1] = math;
        asignaturas2[2] = history;
        Student alumn11 = new Student(54765980, "Hipatia Fioretti");
        Student alumm12 = new Student(54786312, "Jorge Garzia");
        Student alumn13 = new Student(51876543, "Noah Geier");
        Student alumn14 = new Student(56777890, "Jorge Vicente", grupos1);
        //III e
        alumn14.showGroupSections(1);
        //III f
        alumn14.showProfessorBySection("Fisica");
        //III g
        profe1.showGroupStudentsBySection(2);


    }
}
