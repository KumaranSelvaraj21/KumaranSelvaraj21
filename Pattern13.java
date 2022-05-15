package dsa.patterns;

import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {

//        Given an integer N. Print a photo frame of stars of N * N size.
//
//        Input:-5
//
//        Output:-
//            *****
//            *___*
//            *___*
//            *___*
//            *****
//        Here '_' is used to represent spaces. You have to print spaces in your code.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            for(int j=1;j<=num;j++){
                if(i==1 || i==num){
                    System.out.print("*");
                }
            }
            if(i>=2 && i<num){
                System.out.print("*");
                for(int j=1; j<=num-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
