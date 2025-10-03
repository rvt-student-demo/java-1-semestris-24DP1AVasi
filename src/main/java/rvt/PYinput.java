package rvt;


import java.util.Scanner;
public class PYinput {

    public static String InStr(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        String str = scan.nextLine();
        scan.close();
        return str;
    }
    public static int InInt(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int Int = Integer.valueOf(scan.nextLine());
        scan.close();
        return Int;
    }
    public static Double InDou(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        Double dou = Double.valueOf(scan.nextLine());
        scan.close();
        return dou;
    }
}
