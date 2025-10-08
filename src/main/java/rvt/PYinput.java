package rvt;


import java.util.Scanner;
public class PYinput {
    
    // String input
    public static String InStr(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String str = scan.nextLine();
        return str;
    }

    // Integer input
    public static int InInt(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int Int = Integer.valueOf(scan.nextLine());
        return Int;
    }

    // Double input
    public static Double InDou(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        Double dou = Double.valueOf(scan.nextLine());
        return dou;

    }
}
