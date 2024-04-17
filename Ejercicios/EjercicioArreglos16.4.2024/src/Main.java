import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array [] = new int[10];
        for (int i = 0; i <= 9; i++){
            while (true){
                try {
                    System.out.println("Ingrese un numero entero en la posicion "+ (i + 1) + ": ");
                    array[i] = sc.nextInt();
                    break;
                }catch (Exception e){
                    System.out.println("Debe ingresar un numero entero");
                    sc.nextLine();
                }
            }
        }

        int elderly = array[0];

        for (int i = 0; i <= 9; i++){
            if (array[i] > elderly){
                elderly = array[i];
            }
        }
        System.out.println("El numero mayor ubicado en el array es: " + elderly);
    }
}