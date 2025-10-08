package rvt;

import rvt.PYinput;
public class Swap {
    public static void main(String[] args){
        int[] numbers= new int[5];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;
        numbers[4] = 1;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int ind1 = PYinput.InInt("Give two indexes to swap:\n");
        int ind2 = PYinput.InInt("");
        int temp = numbers[ind1];
        numbers[ind1] = numbers[ind2];
        numbers[ind2] = temp;   
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\n"+numbers[i]);
        }
    }
}