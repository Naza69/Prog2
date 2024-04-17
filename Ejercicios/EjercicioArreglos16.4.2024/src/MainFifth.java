import java.util.ArrayList;
import java.util.Scanner;

public class MainFifth {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int highest = 0;
        int counter = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Introduzca el numero de la posicion ["+i+"]");
            int number = sc.nextInt();
            array.add(number);
            if(number > highest){
                highest = number;
            }
        }
        for(int i = 0; i < 10; i++){
            if(array.get(i) == highest){
                counter++;
            }
        }
        System.out.println("El mayor en el arreglo se repitio "+counter+" veces/vez.");
    }
}
