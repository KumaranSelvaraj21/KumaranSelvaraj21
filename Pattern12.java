package dsa.patterns;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
//        num1=4
//        1 2 3 4
//        1 2 3
//        1 2
//        1
//        NOTE: There should be no extra spaces after last integer and before first integer in any row
//        and all integers in any row in the pattern are space separated.

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=num1; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j>=2){
                    System.out.print(" ");
                    System.out.print(j);
                }else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
