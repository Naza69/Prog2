package Ej1;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();
            int randomNumber = rand.nextInt(1, 101);
            System.out.println("Se ha elegido un numero entero al azar comprendido entre\n" +
                    "el 0 (Exclusivo) y el 100 (Inclusivo), a continuacion, avidinelo\n" +
                    "introduciendo un numero:");
            int counterOfGuesses = 0;
            while (true) {
                try {
                    int guessNumber = sc.nextInt();
                    if (guessNumber == randomNumber) {
                        System.out.println("Enhorabuena, ha adivinado el numero! Era " + randomNumber);
                        counterOfGuesses++;
                        System.out.println("Ha intentado adivinar " + counterOfGuesses + " vez/veces.");
                        break;
                    } else if (guessNumber > randomNumber) {
                        System.out.println("Incorrecto! El numero introducido es mayor al que tiene\n" + "que adivinar.");
                        counterOfGuesses++;
                    } else if (guessNumber < randomNumber) {
                        counterOfGuesses++;
                        System.out.println("Incorrecto! El numero introducido es menor al que tiene\n" + "que adivinar");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, introduzca un numero entero, o de plano, un valor numerico en si.");
                    counterOfGuesses++;
                    continue;
                }
            }
            System.out.println("Quiere repetir el proceso? (Responda si o no)");
            String choice = sc.next();
            if (choice.toLowerCase().equals("si")) {
                continue;
            } else if (choice.toLowerCase().equals("no")) {
                break;
            } else if (!choice.toLowerCase().equals("no") && !choice.toLowerCase().equals("si")) {
                while (!choice.toLowerCase().equals("no") && !choice.toLowerCase().equals("si")) {
                    System.out.println("Introduzca si o no");
                    choice = sc.next();
                    if (!choice.toLowerCase().equals("no") && !choice.toLowerCase().equals("si")) {
                        continue;
                    } else break;
                }
                if (choice.equals("si")) {
                    continue;
                } else break;
            }
        }
    }
}