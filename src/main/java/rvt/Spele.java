package rvt;


import java.util.Random;
import java.util.Scanner;
public class Spele {
    public static void main(String[] args) {
    Random ran = new Random();
    Scanner sca = new Scanner(System.in);
    int res = 0;
    System.out.println("Es domāju par skaitli no 1 līdz 10.\nTev tas jauzmin trīs mēģinājumos.\nIevadi minējumu:");
    for (int i = 0; i == 3; i++) {
        res = ran.nextInt(1,11);
        int inp = Integer.valueOf(sca.nextLine());
        if (inp != res) {
            System.out.println("Nepareizi");
        }
        else {
            System.out.println("Pareizi\nTu uzvarēji");
            break;
        }
        }
    }
}
