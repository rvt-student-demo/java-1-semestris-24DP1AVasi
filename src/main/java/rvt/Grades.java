package rvt;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi savu atzimi!");

        int rez = Integer.valueOf(scanner.nextLine());
        
        scanner.close();

        if (rez < 0) {
            System.out.println("impossible!");
        }
        
        else if (rez < 50) {
            System.out.println("failed");
        }
        
        else if (rez < 60) {
            System.out.println("1");
        }
        
        else if (rez < 70) {
            System.out.println("2");
        }
        
        else if (rez < 80) {
            System.out.println("3");
        }
        
        else if (rez < 90) {
            System.out.println("4");
        }
        
        else if (rez < 101) {
            System.out.println("5");
        }

        else if (rez > 100) {
            System.out.println("incredible!");
        }
    
    
    }
    
}
