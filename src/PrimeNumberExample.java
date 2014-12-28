import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PrimeNumberExample {

    public static void main(String args[]) {

        List<Integer> primeList = new ArrayList<Integer>();

        System.out.println("Enter the number till which prime number to be printed: ");
        int limit = new Scanner(System.in).nextInt();

        System.out.println("Printing prime number from 1 to " + limit);
        for(int number = 2; number<=limit; number++){
            //print prime numbers only
            if((number % 100) == 0) {
                System.out.println();
            }

            if(isPrime(number)){
//                primeList.add(number);
                System.out.print(number + " ");

            }
        }
    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
            if(number%i == 0){
                return false; //number is divisible so its not prime
            }
        }
        return true; //number is prime now
    }
}
