package dsa.patterns;

import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        //*****
        //_****
        //__***
        //___**
        //____*
        //Here '_' represent the spaces for explanation purpose only. In your code you have to use spaces.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            if(i>=2){
                for(int k=1; k<=i-1; k++){
                    System.out.print(" ");
                }
            }
            for(int j=num1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
