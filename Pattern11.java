package dsa.patterns;

import java.util.Scanner;

public class Pattern11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=num; i>=1; i--){
            if(i==num){
                for(int j=1; j<=num; j++){
                    System.out.print("*");
                }
            }else if(i<=num && i>1){
                System.out.print("*");
                for(int j=1; j<=i-2; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }else if (i==1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
