public class MainThird {
    public static void main(String[] args) {

        int array [] = new int[10];
        int countPrimes = 0;

        for (int i = 100; i <= 300; i++ ){
            if (isPrime(i)){
                array[countPrimes] = i;
                countPrimes ++;
                if (countPrimes == 10){
                    break;
                }
            }
        }


        System.out.println("Numeros Primos comprendidos entre 100 y 300: ");
        for (int z = 0; z <= 9; z++){
            if (array[z] == array.length){
                System.out.println(" " + array[z]);
            }else{
                System.out.print(array[z] + ", ");
            }
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

