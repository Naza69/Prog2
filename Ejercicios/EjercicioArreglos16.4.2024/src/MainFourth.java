//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Scanner;

public class MainFourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayFourPositions = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            System.out.println("Introduzca el numero de la casilla ["+i+"]");
            int number = sc.nextInt();
            array.add(number);
            String numberString = String.valueOf(number);
            if(numberString.endsWith("4")){
               arrayFourPositions.add(i);
            }
        }
        System.out.println("Las posiciones de los numeros terminados en cuatro son las siguientes: ");
        System.out.println(arrayFourPositions);
    }
}