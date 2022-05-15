package dsa.patterns;

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
//        Given an integer N. Print N lines. The ith line having 2 * N - (i-1) * 2 stars
//        and (i-1) * 2 spaces.
//
//        Input:-5
//
//        Output:-
//
//            ********** // 0 spaces
//
//            ****__**** // 2 spaces
//
//            ***____*** // 4 spaces
//
//            **______** // 6 spaces
//
//            *________* // 8 spaces
//
//            Here '_' is used to represent spaces. You have to print spaces in your code.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            int stars = 2*num1-(i-1)*2;
            int spaces = (i-1)*2;
            if(spaces == 0){
                for(int j=1;j<=stars; j++){
                    System.out.print("*");
                }
            }else{
                for(int k=1; k<=stars/2; k++){
                    System.out.print("*");
                }
                for(int l=1;l<=spaces;l++){
                    System.out.print(" ");
                }
                for(int k=1; k<=stars/2; k++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
