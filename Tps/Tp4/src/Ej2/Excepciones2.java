package Ej2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double n;
        int posicion = 0;
        String cadena;
        double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, 105.2};
        System.out.println("Contenido del array antes de modificar:");
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%.2f ", valores[i]);
        }
        try {
            System.out.print("\n\nIntroduce la posición del array a modificar: ");
            cadena = sc.nextLine();
            try {
                posicion = Integer.parseInt(cadena);
            } catch (NumberFormatException e){
                System.out.println("El valor introducido no es pasable a numerico, introduzca un valor numerico.");
            }
            System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
        } catch (InputMismatchException e) {
            System.out.println("Por favor, introduzca un valor numerico entero.");
        }
        try {
            n = sc.nextDouble();
            valores[posicion] = n;
            System.out.println("\nPosición a modificar " + posicion);
            System.out.println("Nuevo valor: " + n);
            System.out.println("Contenido del array modificado:");
            for (int i = 0; i < valores.length; i++) {
                System.out.printf("%.2f ", valores[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Introduzca un valor numerico, de ser posible, decimal.");
        }
    }
}