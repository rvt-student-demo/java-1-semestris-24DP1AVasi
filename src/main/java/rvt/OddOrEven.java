package rvt;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a nuber:");

        int atb = Integer.valueOf(scanner.nextLine());

        scanner.close();

        if (atb % 2 == 0) {
            System.out.println("Number "+ atb +" is even.");
        }

        else {
            System.out.println("Number "+atb+" is odd.");
        }
    }
}
