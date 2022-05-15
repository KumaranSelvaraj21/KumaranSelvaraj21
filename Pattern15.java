package dsa.patterns;

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {

//        Given an integer N. Print N lines.
//        The ith line having 2 * N - (i-1) * 2 stars
//        and (i-1) * 2 spaces.
//
//        Input:-5
//
//        Output:-
//        ********** // 0 spaces
//        ****__**** // 2 spaces
//        ***____*** // 4 spaces
//        **______** // 6 spaces
//        *________* // 8 spaces
//
//        Here '_' is used to represent spaces. You have to print spaces in your code.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            //stars
            for(int j=num; j>=i; j--){
                System.out.print("*");
            }
            //Spaces
            for(int j=1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=num; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
