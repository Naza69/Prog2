package Ej4;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        HashSet<Student> alumnos = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String option;


        while (true){
            System.out.println("Que desea hacer?");
            System.out.println("1)_Agregar alumno a la lista\n2)_Mostrar lista completa de alumnos" +
                    "\n3)_Calcular el promedio de las notas\n4)_Mostrar al alumno con la nota mas alta\n5)_Buscar alumno\n6)_Salir\n");
            System.out.print("--->");
            option = sc.nextLine();
            if (Objects.equals(option, "1")) {
                addStudent(alumnos);

            }else if (Objects.equals(option, "2")) {
                showStudents(alumnos);

            } else if (Objects.equals(option, "3")) {
                calculateAverage(alumnos);

            } else if (Objects.equals(option, "4")) {
                showStudentWithHigherNote(alumnos);

            }else if (Objects.equals(option, "5")){
                System.out.println("Ingrese el nombre del alumno que desea buscar: ");
                String nameStudent = sc.nextLine();
                nameStudent = nameStudent.toLowerCase(); //Lo convierto a minuscula
                findStudent(alumnos,nameStudent);

            } else if (Objects.equals(option, "6")) {
                break;
            }else System.out.println("Dato ingresado no valido");

        }

        System.out.println("Saliendo...");
        System.out.println("Adios!!");


    }

    //---------------------------------------------------------------------


    public static void addStudent(HashSet<Student> alumnos){
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        double note = 0;
        while (true){
            try {
                System.out.println("Ingrese el nombre del alumno: ");
                name = sc.nextLine();
                System.out.println("Ingrese la edad del alumno: ");
                age = sc.nextInt();
                System.out.println("Ingrese la nota del alumno: ");
                note = sc.nextDouble();

                if (containsNumbers(name) || (age < 13 || age > 18) || note < 0){
                    System.out.println("Datos ingresados no validos");
                    sc.nextLine();
                }else {
                    break;
                }
            }catch (Exception e){
                System.out.println("Dato ingresado invalido");
                sc.nextLine();
            }

        }

        boolean coincidence = false;

        for (Student a : alumnos){
            if ((Objects.equals(a.getName(), name)) && Objects.equals(a.getAge(), age) && Objects.equals(a.getNote(), note)){
                coincidence = true;
            }else coincidence = false;
        }

        if (coincidence){
            System.out.println("El alumno ya esta en la lista");
        }else {
            alumnos.add( new Student(age, name, note));
            System.out.println("Alumno agregado a la lista");
        }

    }

    //---------------------------------------------------------------------

    public static boolean containsNumbers(String name) {
        Pattern p = Pattern.compile(".*\\d.*");
        Matcher m = p.matcher(name);
        return m.matches();
    }

    //---------------------------------------------------------------------


    public static void showStudents(HashSet<Student>alumnos){
        System.out.println(" ");
        for (Student a : alumnos){
            a.infoStudent();
            System.out.println("--------------------");
        }
    }



    public static void calculateAverage(HashSet<Student>alumnos){
        double suma = 0, prom = 0;
        for (Student a : alumnos){
            suma += a.getNote();
        }
        prom = suma / alumnos.size();

        System.out.println("El promedio de las notas es: " + prom);
    }



    public static void showStudentWithHigherNote(HashSet<Student>alumnos){
        double highestGrade = 0 ;
        String studentName = " ";
        if (alumnos.isEmpty()){
            System.out.println("No hay alumnos en la lista");
        }else {
            for (Student a : alumnos){
                if (a.getNote() > highestGrade){
                    highestGrade = a.getNote();
                    studentName = a.getName();

                }
            }

            System.out.println("La mayor nota es  del alumno: " + studentName + " que se saco un: " + highestGrade);
        }
    }


    public static void findStudent(HashSet<Student>alumnos, String studentName){
        boolean exist = false;
        for (Student a : alumnos){
            if (a.getName().toLowerCase().equals(studentName)){
                a.infoStudent();
                exist = true;
            }
        }
        if (exist == false){
            System.out.println("No se encontro al alumno en la lista");
        }
    }



}