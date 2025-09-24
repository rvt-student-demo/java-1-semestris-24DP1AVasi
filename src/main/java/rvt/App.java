package rvt;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ievadi preci: ");
        String prece = String.valueOf(scan.nextLine());
        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scan.nextLine());
        System.out.print("Ekspress piegāse (0=nē, 1=jā): ");
        double pieg = Double.valueOf(scan.nextLine());

        if (pieg == 1) {
            pieg = 3;
        }
        else {
            pieg = 0;
        }
        if (cena < 10) {
            pieg += 2;
        }
        else {
            pieg = 0;
        }
        System.out.println("Rēķins:\n\t"+prece+"\t"+cena+"\n\tpiegāde\t"+pieg+"\n\tkopā\t"+(cena + pieg));
        
        scan.close();

        // if (num % 3 == 0 && num % 5 != 0) {
        //     System.out.println("Fizz");
        // } 
        // else if (num % 5 == 0 && num % 3 != 0) {
        //     System.out.println("Buzz");
        // }
        // else if (num % 3 == 0 && num % 5 == 0) {
        //     System.out.println("FizzBuzz");
        // }
        // if (age > 18) {
        //     System.out.println("Tu esi pilngadīgs");
        // }

        // else {
        //     System.out.println("Tu nevari lietot programmu");
        // }
        
    }
}
