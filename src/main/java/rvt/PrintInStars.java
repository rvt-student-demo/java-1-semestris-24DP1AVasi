package rvt;


import rvt.PYinput;
public class PrintInStars {
    public static void main(String[] args) {
        int[] arr = new int[PYinput.InInt("Cik lielu mašivu tu vēlies izveidot?\n")];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = PYinput.InInt("Ievadi masiva "+(i  + 1)+". skaitli: ");
        }
        ArrayToStars(arr);
    }
    public static void ArrayToStars(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
