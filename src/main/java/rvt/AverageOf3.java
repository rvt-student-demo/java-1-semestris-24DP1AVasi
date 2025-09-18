package rvt;

import java.util.Scanner;

public class AverageOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int num3 = Integer.valueOf(scanner.nextLine());

        scanner.close();

        System.out.println("Trīs skaitlu videjais ir:\n"+(num1 + num2 +num3) / 3);
    }
}
