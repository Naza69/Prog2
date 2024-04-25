package Ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> week = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miercoles", "Jueves", "Viernes",
                "Sabado", "Domingo"));
        week.add(4,"Juernes");

        for (String p : week){
            System.out.println(p);
        }

        System.out.println("----------------------------------------");


        System.out.println(week.get(3) + " " + week.get(4));


        System.out.println("----------------------------------------");


        System.out.println(week.get(0) + " " + week.get(6));

        System.out.println("----------------------------------------");



        week.remove("Juernes");

        if (week.contains("Juernes")){
            System.out.println("El elemento si esta en la lista");
        }else System.out.println("El elemento no esta en la lista");

        System.out.println("----------------------------------------");

        //Crea un iterador y muestras uno a uno los valores de la lista
        Iterator<String>it = week.iterator();

        while (it.hasNext()){
            String word = it.next();
            System.out.println(word);
        }


        System.out.println("----------------------------------------");

        boolean found = false;
        it = week.iterator();
        while (it.hasNext()) {
            String word = it.next();
            if (word.equals("Lunes")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Si existe un elemento que se denomine Lunes");
        } else {
            System.out.println("No existe un elemento que se denomine Lunes");
        }
        System.out.println("----------------------------------------");


        found = false;
        it = week.iterator();
        while (it.hasNext()) {
            String word = it.next();
            if (word.toLowerCase().equals("lunes")) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Si existe un elemento que se denomine Lunes");
        } else {
            System.out.println("No existe un elemento que se denomine Lunes");
        }
        System.out.println("----------------------------------------");


        System.out.println("Elementos de la lista antes de borrarla: ");
        for (String p : week){
            System.out.println(p);
        }

        week.clear();

        System.out.println("Elementos de la lista luego de borrarla: ");
        for (String p : week){
            System.out.println(p);
        }


    }

}
