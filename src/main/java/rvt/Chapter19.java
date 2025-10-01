package rvt;


import java.util.Scanner;
public class Chapter19 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
    }
    // 1.uzdevums
    public static void ex1() {
        Scanner scan = new Scanner(System.in);
        for (int i = Integer.valueOf(scan.nextLine());i <= Integer.valueOf(scan.nextLine()); i++) {
            System.out.println(i);
        }
    }
    // 2.uzdevums
    public static void ex2() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = Integer.valueOf(scan.nextLine());
        for (int i = 1;i <= n; i++) {
            sum += i;
        }    
        System.out.println("Loop sum = "+sum);
        System.out.println("Formula sum = "+(n*(n + 1)) / 2);
    }
    // 3.uzdevums
    public static void ex3() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int n = Integer.valueOf(scan.nextLine());
        for (int i = 1;i <= n; i++) {
            sum += i * i ;
        }    
        System.out.println("Loop sum = "+sum);
        System.out.println("Formula sum = "+(n*(n + 1) * (2 * n + 1)) / 6);
    }
    // 4.uzdevums
    public static void ex4() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int low = Integer.valueOf(scan.nextLine());
        int high = Integer.valueOf(scan.nextLine());
        for (int i = low;i <= high; i++) {
            sum += i;
        }    
        System.out.println("Loop sum = "+sum);
    }
    // 5.uzdevums
    public static void ex5() {
        var scan = new Scanner(System.in);
        String word = scan.nextLine();
        int gar = word.length();
        for (int i = 0;i < gar; i++) {
            System.out.println(word);
        }    
    }
    // 6.uzdevums
    public static void ex6() {
        var scan = new Scanner(System.in);
        String word1 = scan.nextLine();
        String word2 = scan.nextLine();
        int gar = (word1 + word2).length();
        System.out.print(word1);
        for (int i = gar;i < 30; i++) {
            System.out.print(".");
        }
        System.out.println(word2);    
    }
    // 7.uzdevums
    public static void ex7() {
        var scan = new Scanner(System.in);
        String word = scan.nextLine();
        for (int i = 0;i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }  
    }
}
