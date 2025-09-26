package rvt;
import java.util.Scanner;


public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ievadi :");
        int num = Integer.valueOf(scan.nextLine());
        int sum = num;
        int sk = 0;
        while (num != 0) {
            System.out.println("Ievadi skaitli:");
            num = Integer.valueOf(scan.nextLine());
            sum += num;
            sk += 1;
        }
        System.out.println("Skaitlu daudzums " + sk);
        System.out.println("Tava summa ir " + sum);

    }
}