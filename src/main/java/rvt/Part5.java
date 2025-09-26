package rvt;


import java.util.Scanner;
public class Part5 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Give numbers:");

        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;

        for (int i = 0; true; i++) {
            int num = Integer.valueOf(sca.nextLine());
            if (num != -1) {
                sum += num;
                count++;
            }
            else {
                break;
            }
            if (num % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Thx! Bye!\nSum: " + sum + "\nNumbers: " + count + "\nAverage: " + (double) sum / count + "\nEven: " + even + "\nOdd: " + odd);
        sca.close();
    }
}
