package Ej3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double base = 0;
        double height = 0;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("A continuacion, ingrese el valor de la base del triangulo.");
            try {
                base = sc.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Ingrese un valor numerico por favor, de ser posible, un valor decimal.");
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("Ahora ingrese el valor de su altura.");
            try {
                height = sc.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("Ingrese un valor numerico por favor, de ser posible, un valor decimal.");
                sc.nextLine();
                continue;
            }
            sc.nextLine();
            System.out.println("El area de su triangulo es: "+(base*(height/2)));
            String choice;
            System.out.println("Quiere repetir el proceso?");
            while(true){
                choice = sc.next();
                if(!choice.toLowerCase().equals("si") && (!choice.toLowerCase().equals("no"))){
                    System.out.println("Por favor, ingrese si o no.");
                    continue;
                } else {
                    break;
                }
            }
            if(choice.toLowerCase().equals("si")){
                continue;
            } else {
                break;
            }
        }
    }
}
