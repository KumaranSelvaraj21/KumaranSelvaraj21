package dsa.patterns;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {
        //Given an integer N (N >= 2).
        // Print N lines with two stars ('*') in each line with N - 2 spaces in between.
        //*___*
        //*___*
        //*___*
        //*___*
        //*___*

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            System.out.print("*");
            for(int j=1; j<=num1-2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
