package rvt;


import rvt.PYinput;
public class SumOfArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = PYinput.InInt("Ievadi "+(i  + 1)+" skaitli: ");
        }
        SumArray(array);
    }
    public static int SumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Summa ir " + sum);
        return sum;
    }
}
