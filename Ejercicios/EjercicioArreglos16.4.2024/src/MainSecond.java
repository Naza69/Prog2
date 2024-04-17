import java.util.ArrayList;
import java.util.Scanner;

public class MainSecond {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        ArrayList<Integer> prime = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            while (true) {
                try {
                    System.out.println("Ingrese un numero entero en la posicion " + (i + 1) + ": ");
                    array[i] = sc.nextInt();
                    if (isPrime(array[i])) {
                        prime.add(array[i]);
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Debe ingresar un numero entero");
                    sc.nextLine();
                }
            }
        }
        if (prime.isEmpty()) {
            System.out.println("No se han ingresado numeros primos");
        } else {
            int elderlyPrime = prime.get(0);
            for (Integer z : prime) {
                if (z > elderlyPrime) {
                    elderlyPrime = z;
                }
            }
            System.out.println("El mayor numero primo es: " + elderlyPrime);
        }
    }
    public static boolean isPrime ( int num){
        int countDiv = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                countDiv++;
            }
        }
        if (countDiv <= 2) {
            return true;
        } else return false;
    }

}
