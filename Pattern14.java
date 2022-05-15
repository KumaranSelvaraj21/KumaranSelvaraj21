package dsa.patterns;

import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {

//        Given an integer N. Print N lines. The ith line having i * 2 stars and 2 * (N-i) spaces.
//
//        Input:-5
//
//        Output:-
//        *________* // 8 spaces
//        **______** // 6 spaces
//        ***____*** // 4 spaces
//        ****__**** // 2 spaces
//        ********** // 0 spaces
//
//        Here '_' is used to represent spaces. You have to print spaces in your code.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            for(int j=1; j<=2*(num-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
