package dsa.patterns;

import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args) {
        //1
        //1_
        //1_3
        //1_3_
        //1_3_5

        //1_3 "_" represents spaces
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for(int i=1; i<=num1; i++){
            for(int j=1;j<=i; j++){
                if(j%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}
