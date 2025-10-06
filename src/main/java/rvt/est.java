package rvt;


import rvt.PYinput;
import java.util.Scanner;
public class est {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vards = PYinput.InStr("Ievadi vardu: ");
        int vecums = PYinput.InInt("Ievadi vecumu: ");
        double svars = PYinput.InDou("Ievadi svaru: ");
        System.out.println("Tavs vārds ir " + vards + ", tavs vecums ir " + vecums + " un svars ir " + svars + "kg.");
        scan.close();
    }
}
