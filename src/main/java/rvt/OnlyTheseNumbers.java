package rvt;


import java.util.Scanner;
import rvt.PYinput;
public class OnlyTheseNumbers {
    public static void main(String[] args) {
        int[] list = new int[0];
        while (true) {
            int user = PYinput.InInt("");
            if (user != -1) {
                list.add(user);
            }
        }
    }
}
