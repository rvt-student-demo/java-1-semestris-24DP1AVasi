package rvt;
import java.util.Scanner;


public class Detalas {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int sk = 5;
        int uz = 3;
        int pa = 1;
        System.out.print("Cik skrūves tev vajag:");
        sk = 5 * Integer.valueOf(scan.nextLine());
        
        System.out.print("Cik uzgriežņus tev vajag:");
        uz = 3 * Integer.valueOf(scan.nextLine());
        
        System.out.print("Cik paplāksnes tev vajag:");
        pa = 1 * Integer.valueOf(scan.nextLine());
        
        scan.close();

        if (sk != uz) {
            if (sk > uz) {
                System.out.println("Pārbaudi pasūtijumu: par maz uzgriežņu");
            }
            else {
                System.out.println("Pārbaudi pasūtijumu: par maz skrūvju");
            }
        }
        else if (sk * 2 != pa) {
            System.out.println("Pārbudi psūtijumu: par maz paplākšņu");
        }
        else {
            System.out.println("Viss kārtībā");
        }
        System.out.println("Tev kopā ir jāmaksā "+(sk + uz + pa)+" centi.");

    
    
    }
}
