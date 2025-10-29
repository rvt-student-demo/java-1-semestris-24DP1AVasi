package rvt;


import java.util.Scanner;
import rvt.PYinput;
public class OnlyTheseNumbers {
    public static void main(String[] args) {
        int[] list = new int[0];
        while (true) {
            int user = PYinput.InInt("");
            if (user != -1) {
                int[] newList = new int[list.length + 1];
                System.arraycopy(list, 0, newList, 0, list.length);
                newList[newList.length - 1] = user;
                list = newList;
            } else {
                break;
            }
        }
    }
}
