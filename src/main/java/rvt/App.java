package rvt;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi num:");

        int num = Integer.valueOf(scanner.nextLine());

        scanner.close();

        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        } 
        else if (num % 5 == 0 && num % 3 != 0) {
            System.out.println("Buzz");
        }
        else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        }
        // if (age > 18) {
        //     System.out.println("Tu esi pilngadīgs");
        // }

        // else {
        //     System.out.println("Tu nevari lietot programmu");
        // }
        
    }
}
