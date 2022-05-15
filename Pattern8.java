package dsa.patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        //____* // 4 spaces
        //___** // 3 spaces
        //__*** // 2 spaces
        //_**** // 1 space
        //***** // 0 space
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            for(int j=1; j<=num1-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
