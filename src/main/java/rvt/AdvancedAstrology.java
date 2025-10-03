package rvt;


import java.util.Scanner;
public class AdvancedAstrology {
    public static void main(String[] args) {
        
        tree(InInt("Ievadi egles augstumu: "));
    }

    // Tree
    public static void tree(int height) {
        size(height);
        for (int i = 0; i < 2; i++) {
            for (int j = 2; j < height; j++) {
                space();
            }
            for (int k = 0; k < 3; k++) {
                star();
            }
            System.out.println();
        }
    }

    // Size
    public static void size(int size) {
        System.out.println();
        int minus = 1;
        for (int i = 0; i < size; i++) {
            for (int j = size - minus; j > 0 ; j--) {
                space();
            }
            for (int k = size - minus; k < size; k++) {
                star();
            }
            for (int k = size - minus + 1; k < size; k++) {
                star();
            }
            minus += 1;
            System.out.println();
        }
    }

    // Star
    public static void star() {
        System.out.print("*");
    }
    
    // Space
    public static void space() {
        System.out.print(" ");
    }

    // Integer input
    public static int InInt(String text) {
         Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int Int = Integer.valueOf(scan.nextLine());
        scan.close();
        return Int;
    }
}