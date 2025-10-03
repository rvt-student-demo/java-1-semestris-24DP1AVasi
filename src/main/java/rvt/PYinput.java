package rvt;


import java.util.Scanner;
public class PYinput {
    
    // String
    public static String InStr(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String str = scan.nextLine();
        scan.close();
        return str;
    }

    // Integer
    public static int InInt(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int Int = Integer.valueOf(scan.nextLine());
        scan.close();
        return Int;
    }

    // Double
    public static Double InDou(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        Double dou = Double.valueOf(scan.nextLine());
        scan.close();
        return dou;
    }
}
